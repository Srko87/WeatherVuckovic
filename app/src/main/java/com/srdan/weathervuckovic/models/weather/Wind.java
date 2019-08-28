package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;

public class Wind implements Serializable {
    float speed;
    float deg;

    public float getSpeed() {
        return speed;
    }

    public float getDeg() {
        return deg;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}
