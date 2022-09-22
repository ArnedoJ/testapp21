package com.example.testapp21.model;

import androidx.annotation.NonNull;

public class Movie {
    private String title;
    private String genre;
    private int duration;
    private int year;

    public Movie(String title, String genre, int duration, int year) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @NonNull
    @Override
    public String toString() {
        return title + ", " + year;
    }
}
