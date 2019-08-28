package com.srdan.weathervuckovic.models.video;

import java.io.Serializable;

public class PageInfo implements Serializable {

    int totalResults;
    int resultsPerPage;

    public int getTotalResults() {
        return totalResults;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "totalResults=" + totalResults +
                ", resultsPerPage=" + resultsPerPage +
                '}';
    }
}
