package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;

public class Sys implements Serializable {
    String pod;

    public String getPod() {
        return pod;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "pod='" + pod + '\'' +
                '}';
    }
}
