package com.betrybe.weatherreport.bean;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import com.betrybe.weatherreport.interfaces.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The type Get weather report config.
 */
@Component
public class GetWeatherReport implements WeatherService {
  private WeatherClient weatherClient;

  @Autowired
  public GetWeatherReport(WeatherClient weatherClient) {
    this.weatherClient = weatherClient;
  }

  @Override
  public String getWeatherReport(String city) {
    return "O clima é: %s".formatted(weatherClient.getWeather(city));
  }
}
