package com.srdan.weathervuckovic.models.video;

import java.io.Serializable;

public class VideoResource implements Serializable {

    String kind;
    String etag;
    VideoId id;
    Snippet snippet;

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public VideoId getId() {
        return id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    @Override
    public String toString() {
        return "VideoResource{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", id=" + id +
                ", snippet=" + snippet +
                '}';
    }
}
