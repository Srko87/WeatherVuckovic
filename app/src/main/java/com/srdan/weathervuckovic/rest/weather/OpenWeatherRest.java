package com.srdan.weathervuckovic.rest.weather;

import android.app.Activity;
import android.widget.Toast;

import com.srdan.weathervuckovic.MainActivity;
import com.srdan.weathervuckovic.models.weather.WeatherResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenWeatherRest {

    public static final String API_KEY = "2b0d6764463fd937b530be39cea72cf6";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public void fetchWeatherResults(String cityName, final MainActivity mainActivity) {
        WeatherService weatherService = retrofit.create(WeatherService.class);

        weatherService.listWeather(cityName, API_KEY, "24", "metric").enqueue(new Callback<WeatherResult>() {
            @Override
            public void onResponse(Call<WeatherResult> call, Response<WeatherResult> response) {
                if (response.body() != null) {
                    mainActivity.showWeatherView(response.body());
                } else {
                    printEmptyMessage(mainActivity);
                }
            }

            @Override
            public void onFailure(Call<WeatherResult> call, Throwable t) {
                printEmptyMessage(mainActivity);
            }
        });
    }

    private void printEmptyMessage(Activity activity) {
        Toast.makeText(activity, "No results for chosen city.",
                Toast.LENGTH_SHORT).show();
    }
}
