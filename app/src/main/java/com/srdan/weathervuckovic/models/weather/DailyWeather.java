package com.srdan.weathervuckovic.models.weather;

import java.io.Serializable;
import java.util.Date;

public class DailyWeather implements Serializable {

    float dailyMinimalTemp;
    float dailyMaximalTemp;
    Date date;
    String description;
    String dayLabel;

    public float getDailyMinimalTemp() {
        return dailyMinimalTemp;
    }

    public void setDailyMinimalTemp(float dailyMinimalTemp) {
        this.dailyMinimalTemp = dailyMinimalTemp;
    }

    public float getDailyMaximalTemp() {
        return dailyMaximalTemp;
    }

    public void setDailyMaximalTemp(float dailyMaximalTemp) {
        this.dailyMaximalTemp = dailyMaximalTemp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDayLabel() {
        return dayLabel;
    }

    public void setDayLabel(String dayLabel) {
        this.dayLabel = dayLabel;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "dailyMinimalTemp=" + dailyMinimalTemp +
                ", dailyMaximalTemp=" + dailyMaximalTemp +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", dayLabel='" + dayLabel + '\'' +
                '}';
    }
}
