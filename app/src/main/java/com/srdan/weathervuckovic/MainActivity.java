package com.srdan.weathervuckovic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.srdan.weathervuckovic.models.weather.WeatherResult;
import com.srdan.weathervuckovic.rest.weather.OpenWeatherRest;
import com.srdan.weathervuckovic.views.WeatherView;
import com.srdan.weathervuckovic.helpers.Networking;

public class MainActivity extends AppCompatActivity {

    OpenWeatherRest weatherRest = new OpenWeatherRest();
    Networking networking = new Networking(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        submitCityForWeather();
    }

    private void submitCityForWeather() {
        Button submitButton = findViewById(R.id.submit_city);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (networking.isConnectedToInternet()) {
                    EditText edit = findViewById(R.id.enter_city);
                    String cityNameVariable = edit.getText().toString();
                    weatherRest.fetchWeatherResults(cityNameVariable, MainActivity.this);
                } else {
                    networking.displayDisconnectedToast();
                }
            }
        });
    }

    public void showWeatherView(WeatherResult weatherResult) {
        Intent intent = new Intent(MainActivity.this, WeatherView.class);
        intent.putExtra("weatherResult", weatherResult);
        startActivity(intent);
    }


}
