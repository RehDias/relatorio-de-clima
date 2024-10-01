package com.betrybe.weatherreport.bean;

import com.betrybe.weatherreport.interfaces.WeatherClient;

/**
 * The type Weather.
 */
public class Weather implements WeatherClient {

  @Override
  public String getWeather(String city) {
    return "nublado";
  }
}
