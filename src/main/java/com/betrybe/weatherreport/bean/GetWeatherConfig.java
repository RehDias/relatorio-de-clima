package com.betrybe.weatherreport.bean;

import com.betrybe.weatherreport.interfaces.WeatherClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type Weather config.
 */
@Configuration
public class GetWeatherConfig {

  @Bean
  WeatherClient weatherClient() {
    return new Weather();
  }
}
