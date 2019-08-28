package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;

public class Clouds implements Serializable {
    int all;

    public int getAll() {
        return all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}
