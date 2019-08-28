package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;
import java.util.List;

public class Forecast implements Serializable {

    long dt;
    Temperature main;
    List<Weather> weather;
    Clouds clouds;
    Wind wind;
    Rain rain;
    Sys sys;
    String dt_txt;

    public long getDt() {
        return dt;
    }

    public Temperature getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public Rain getRain() {
        return rain;
    }

    public Sys getSys() {
        return sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "dt=" + dt +
                ", main=" + main +
                ", weather=" + weather +
                ", clouds=" + clouds +
                ", wind=" + wind +
                ", rain=" + rain +
                ", sys=" + sys +
                ", dt_txt='" + dt_txt + '\'' +
                '}';
    }
}
