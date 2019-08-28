package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;
import java.util.List;

public class WeatherResult implements Serializable {

    City city;
    String cod;
    float message;
    int cnt;
    List<Forecast> list;

    public City getCity() {
        return city;
    }

    public String getCod() {
        return cod;
    }

    public float getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public List<Forecast> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "WeatherResult{" +
                "city=" + city +
                ", cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", list=" + list +
                '}';
    }
}
