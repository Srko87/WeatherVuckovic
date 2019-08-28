package com.srdan.weathervuckovic.rest.video;

import com.srdan.weathervuckovic.models.video.VideoSearchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {

    @GET("/youtube/v3/search")
    Call<VideoSearchResult> fetchVideo(@Query("part") String part,
                                       @Query("q") String description,
                                       @Query("maxResults") int maxResults,
                                       @Query("key") String apiKey);
}
