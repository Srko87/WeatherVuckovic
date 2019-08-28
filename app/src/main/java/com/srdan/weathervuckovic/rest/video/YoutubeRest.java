package com.srdan.weathervuckovic.rest.video;

import android.app.Activity;
import android.widget.Toast;

import com.srdan.weathervuckovic.models.video.VideoSearchResult;
import com.srdan.weathervuckovic.views.WeatherView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class YoutubeRest {

    public static final String API_KEY_YOUTUBE = "AIzaSyAPiK7mdLVtE3twhn1imr8Y6fomoMF_aUQ";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.googleapis.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public void fetchVideoResults(String searchQuery, final WeatherView weatherView) {
        SearchService searchService = retrofit.create(SearchService.class);

        searchService.fetchVideo("snippet", searchQuery, 1, API_KEY_YOUTUBE).enqueue(new Callback<VideoSearchResult>() {
            @Override
            public void onResponse(Call<VideoSearchResult> call, Response<VideoSearchResult> response) {
                if (response.body() != null) {
                    VideoSearchResult result = response.body();
                    weatherView.openYoutubeVideo(result.getItems().get(0).getId().getVideoId());
                } else {
                    printEmptyMessage(weatherView);
                }
            }

            @Override
            public void onFailure(Call<VideoSearchResult> call, Throwable t) {
                printEmptyMessage(weatherView);
            }
        });

    }

    private void printEmptyMessage(Activity activity) {
        Toast.makeText(activity, "No videos found.",
                Toast.LENGTH_SHORT).show();
    }
}
