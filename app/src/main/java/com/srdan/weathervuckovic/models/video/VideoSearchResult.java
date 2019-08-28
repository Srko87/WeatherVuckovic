package com.srdan.weathervuckovic.models.video;

import java.io.Serializable;
import java.util.List;

public class VideoSearchResult implements Serializable {

    String kind;
    String etag;
    String nextPageToken;
    String prevPageToken;
    String regionCode;
    PageInfo pageInfo;
    List<VideoResource> items;

    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public List<VideoResource> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "VideoSearchResult{" +
                "kind='" + kind + '\'' +
                ", etag='" + etag + '\'' +
                ", nextPageToken='" + nextPageToken + '\'' +
                ", prevPageToken='" + prevPageToken + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", pageInfo=" + pageInfo +
                ", items=" + items +
                '}';
    }
}
