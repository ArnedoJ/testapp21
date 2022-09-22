package com.example.testapp21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.testapp21.model.IMovieDa;
import com.example.testapp21.model.Movie;
import com.example.testapp21.model.MoviesDa;
import com.example.testapp21.model.MoviesFactory;

import java.sql.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spnMovies;
    private ListView lstMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

    }

    private void setupViews() {
        spnMovies = findViewById(R.id.spnMovies);
        lstMovies = findViewById(R.id.lstMovies);
    }

    public void onClick(View view) {
        String item = spnMovies.getSelectedItem().toString();
        MoviesFactory factory = new MoviesFactory();
        IMovieDa data = factory.getInstance();

        List<Movie> result = data.getMoviesByGenre(item);

        ArrayAdapter<Movie> adapter = new ArrayAdapter<Movie>(this,
                android.R.layout.simple_list_item_1, result);
        lstMovies.setAdapter(adapter);


    }
}