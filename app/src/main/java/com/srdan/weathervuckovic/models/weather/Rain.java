package com.srdan.weathervuckovic.models.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Rain implements Serializable {
    @JsonProperty("3h")
    float threehour;

    public float getThreehour() {
        return threehour;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "threehour=" + threehour +
                '}';
    }
}
