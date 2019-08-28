package com.srdan.weathervuckovic.models.video;

import java.io.Serializable;

public class VideoId implements Serializable {

    String kind;
    String videoId;
    String channelId;
    String playlistId;

    public String getKind() {
        return kind;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    @Override
    public String toString() {
        return "VideoId{" +
                "kind='" + kind + '\'' +
                ", videoId='" + videoId + '\'' +
                ", channelId='" + channelId + '\'' +
                ", playlistId='" + playlistId + '\'' +
                '}';
    }
}
