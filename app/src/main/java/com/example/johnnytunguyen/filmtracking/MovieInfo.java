package com.example.johnnytunguyen.filmtracking;

/**
 * Created by JohnnyTuNguyen on 2018-04-12.
 */

public class MovieInfo {
    private int poster;
    private String title;
    private String actors;
    private String description;
    private long rating;
    private String genre;


    public MovieInfo(int poster, String title, String actors, String description, long rating, String genre) {
        this.poster = poster;
        this.title = title;
        this.actors = actors;
        this.description = description;
        this.rating = rating;
        this.genre = genre;
    }


    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
