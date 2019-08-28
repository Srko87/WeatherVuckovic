package com.srdan.weathervuckovic.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.srdan.weathervuckovic.R;
import com.srdan.weathervuckovic.models.weather.DailyWeather;
import com.srdan.weathervuckovic.models.weather.Forecast;
import com.srdan.weathervuckovic.models.weather.WeatherResult;
import com.srdan.weathervuckovic.rest.video.YoutubeRest;
import com.srdan.weathervuckovic.views.adapters.WeatherListAdapter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

public class WeatherView extends AppCompatActivity {

    WeatherResult weatherResult;
    YoutubeRest youtubeRest = new YoutubeRest();
    String cityName;
    LinkedHashMap<String, DailyWeather> dailyWeathers;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);

        weatherResult = (WeatherResult) getIntent().getSerializableExtra("weatherResult");
        cityName = weatherResult.getCity().getName();
        dailyWeathers = new LinkedHashMap<>();

        setWeatherTitle();
        youtubeClickListener();
        formatDailyWeather();

        List<DailyWeather> dailyList = new ArrayList<DailyWeather>(dailyWeathers.values());

        ArrayAdapter<DailyWeather> adapter = new WeatherListAdapter(WeatherView.this, dailyList);
        ListView listView = findViewById(R.id.weather_list);
        listView.setAdapter(adapter);
    }

    private void setWeatherTitle() {
        TextView textView = findViewById(R.id.weather_title);
        textView.setText(cityName);
    }

    private void youtubeClickListener() {
        findViewById(R.id.youtube_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String description = weatherResult.getList().get(0).getWeather().get(0).getDescription();
                youtubeRest.fetchVideoResults(description + " " + cityName, WeatherView.this);
            }
        });
    }

    public void openYoutubeVideo(String videoId) {
        Intent intent = new Intent(WeatherView.this, YoutubeView.class);
        intent.putExtra("videoId", videoId);
        startActivity(intent);
    }

    private void formatDailyWeather() {
        for (int i = 0; i < weatherResult.getList().size(); i++) {
            Forecast forecast = weatherResult.getList().get(i);
            Date forecastDate = new Date();

            try {
                forecastDate = sdf.parse(forecast.getDt_txt());
            } catch (ParseException e) {
                e.printStackTrace();
            }

            String forecastDateString = sdf2.format(forecastDate);

            if (dailyWeathers.get(forecastDateString) != null) {
                DailyWeather daily = dailyWeathers.get(forecastDateString);
                if (daily.getDailyMaximalTemp() < forecast.getMain().getTemp_max()) {
                    daily.setDailyMaximalTemp(Math.round(forecast.getMain().getTemp_max()));
                }

                if (daily.getDailyMinimalTemp() > forecast.getMain().getTemp_min()) {
                    daily.setDailyMinimalTemp(Math.round(forecast.getMain().getTemp_min()));
                }

                if (forecast.getDt_txt().contains("12:00:00")) {
                    daily.setDescription(forecast.getWeather().get(0).getDescription());
                }
                dailyWeathers.put(forecastDateString, daily);
            } else {
                DailyWeather daily = new DailyWeather();
                daily.setDailyMaximalTemp(Math.round(forecast.getMain().getTemp_max()));
                daily.setDailyMinimalTemp(Math.round(forecast.getMain().getTemp_min()));
                daily.setDate(forecastDate);
                daily.setDayLabel(dayFormat.format(forecastDate));
                daily.setDescription(forecast.getWeather().get(0).getDescription());
                dailyWeathers.put(forecastDateString, daily);
            }
        }
    }
}
