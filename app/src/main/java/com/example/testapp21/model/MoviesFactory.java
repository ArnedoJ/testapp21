package com.example.testapp21.model;

public class MoviesFactory {

    public IMovieDa getInstance(){
        return new MoviesDa();
    }
}
