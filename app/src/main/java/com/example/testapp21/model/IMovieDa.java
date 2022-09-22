package com.example.testapp21.model;

import java.util.List;

public interface IMovieDa {

    List<Movie> getMoviesByGenre(String genre);
}
