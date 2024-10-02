package com.betrybe.weatherreport.bean;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

/**
 * The type Weather.
 */
public class Weather implements WeatherClient {

  RestTemplate restTemplate;
  ObjectMapper mapper;

  @Value("${api.url.geocode}")
  private String apiGeoUrl;

  @Value("${api.url.weather}")
  private String apiWeatherUrl;

  public Weather() {
    restTemplate = new RestTemplate();
    mapper = new ObjectMapper();
  }

  @Override
  public String getWeather(String city) {

    Geocode geocode = getGeocode(city);

    String currentWeather = getCurrentTemperature(geocode);
    return "temperatura de %sºC na cidade de %s".formatted(currentWeather, city);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  record Geocode(String latitude, String longitude) {}

  private Geocode getGeocode(String city) {

    String result = restTemplate.getForObject(apiGeoUrl.formatted(city), String.class);

    try {
      JsonNode jsonNode = mapper.readTree(result);

      JsonNode cityNode = jsonNode.at("/results/0");

      return  mapper.treeToValue(cityNode, Geocode.class);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  private String getCurrentTemperature(Geocode geocode) {
    WeatherResult weatherResult = restTemplate.getForObject(apiWeatherUrl
        .formatted(geocode.latitude, geocode.longitude), WeatherResult.class);

    assert weatherResult != null;
    return weatherResult.currentWeather.temperature;
  }

  record WeatherResult(@JsonProperty("current_weather") CurrentWeather currentWeather) {}

  record CurrentWeather(String temperature) {}

}
