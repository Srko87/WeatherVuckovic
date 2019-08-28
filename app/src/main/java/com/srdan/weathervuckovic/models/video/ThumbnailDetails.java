package com.srdan.weathervuckovic.models.video;

import java.io.Serializable;

public class ThumbnailDetails implements Serializable {
    String url;
    int width;
    int height;

    public String getUrl() {
        return url;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "ThumbnailDetails{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
