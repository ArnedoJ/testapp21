package com.example.testapp21.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesDa  implements IMovieDa{

    List<Movie> movies;

    public MoviesDa(){
        movies = new ArrayList<>();
        movies.add(new Movie("godfathher1", "Drama", 120, 1972));
        movies.add(new Movie("Shawshank Redemption", "Drama", 120, 1994));
        movies.add(new Movie("godfathher2", "Drama", 120, 1974));
        movies.add(new Movie("The Matrix", "Action", 120, 1999));
        movies.add(new Movie("The Dark Knight", "Action", 120, 2010));
        movies.add(new Movie("Toy Story", "Animation", 120, 1995));

    }

    public List<Movie> getMoviesByGenre(String genre){
        List<Movie> result = new ArrayList<>();

        for(Movie mv : movies){
            if(mv.getGenre().equals(genre)){
                result.add(mv);
            }
        }
        return result;
    }
}
