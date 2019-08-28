package com.srdan.weathervuckovic.rest.weather;

import com.srdan.weathervuckovic.models.weather.WeatherResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("data/2.5/forecast")
    Call<WeatherResult> listWeather(@Query("q") String cityName,
                                    @Query("appid") String apiKey,
                                    @Query("cnt") String cnt,
                                    @Query("units") String units);
}
