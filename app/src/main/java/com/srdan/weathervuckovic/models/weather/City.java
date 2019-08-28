package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;

public class City implements Serializable {

    long id;
    String name;
    Coordinates coord;
    String country;
    int population;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coord=" + coord +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}
