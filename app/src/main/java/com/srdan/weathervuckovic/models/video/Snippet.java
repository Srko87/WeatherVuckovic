package com.srdan.weathervuckovic.models.video;

import java.io.Serializable;
import java.util.Date;

public class Snippet implements Serializable {
    Date publishedAt;
    String channelId;
    String title;
    String description;
    Thumbnails thumbnails;
    String channelTitle;
    String liveBroadcastContent;

    public Date getPublishedAt() {
        return publishedAt;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    @Override
    public String toString() {
        return "Snippet{" +
                "publishedAt=" + publishedAt +
                ", channelId='" + channelId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnails=" + thumbnails +
                ", channelTitle='" + channelTitle + '\'' +
                ", liveBroadcastContent='" + liveBroadcastContent + '\'' +
                '}';
    }
}
