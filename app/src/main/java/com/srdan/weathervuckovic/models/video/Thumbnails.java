package com.srdan.weathervuckovic.models.video;


import java.io.Serializable;

public class Thumbnails implements Serializable {

    ThumbnailDetails defaultThumbnail;

    ThumbnailDetails medium;

    ThumbnailDetails high;

    public ThumbnailDetails getDefaultThumbnail() {
        return defaultThumbnail;
    }

    public ThumbnailDetails getMedium() {
        return medium;
    }

    public ThumbnailDetails getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "Thumbnails{" +
                "defaultThumbnail=" + defaultThumbnail +
                ", medium=" + medium +
                ", high=" + high +
                '}';
    }
}
