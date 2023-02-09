package com.bookanyshow.service;

import com.bookanyshow.model.Movie;
import com.bookanyshow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public List<Movie> searchMovies(){
        return movieRepository.findAll();
    }

    public Movie searchMovieByName(String movieName) {
        Optional<Movie> movie = movieRepository.findByName(movieName);
        if (movie.isEmpty()) {
            throw new RuntimeException("Movie name does not exist!");
        }
        return movie.get();
    }
}
