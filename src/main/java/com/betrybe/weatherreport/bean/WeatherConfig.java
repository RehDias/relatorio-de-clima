package com.betrybe.weatherreport.bean;

import com.betrybe.weatherreport.interfaces.WeatherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type Weather config.
 */
@Configuration
public class WeatherConfig implements WeatherService {

  @Override
  @Bean
  public String getWeatherReport(String city) {
    return "O clima na cidade %s esta ensolarado".formatted(city);
  }
}
