package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;

public class Temperature implements Serializable {

    float temp;
    float temp_min;
    float temp_max;
    float pressure;
    float sea_level;
    float grnd_level;
    float humidity;
    float temp_kf;

    public float getTemp() {
        return temp;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public float getPressure() {
        return pressure;
    }

    public float getSea_level() {
        return sea_level;
    }

    public float getGrnd_level() {
        return grnd_level;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemp_kf() {
        return temp_kf;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temp=" + temp +
                ", temp_min=" + temp_min +
                ", temp_max=" + temp_max +
                ", pressure=" + pressure +
                ", sea_level=" + sea_level +
                ", grnd_level=" + grnd_level +
                ", humidity=" + humidity +
                ", temp_kf=" + temp_kf +
                '}';
    }
}
