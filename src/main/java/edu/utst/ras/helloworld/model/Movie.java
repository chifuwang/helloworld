package edu.utst.ras.helloworld.model;

import java.util.Date;

public class Movie {

    private String title;
    private Integer rank;

    private Date releaseDate;

    public Movie(String title, Integer rank, Date releaseDate) {
        this.title = title;
        this.rank = rank;
        this.releaseDate = releaseDate;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
