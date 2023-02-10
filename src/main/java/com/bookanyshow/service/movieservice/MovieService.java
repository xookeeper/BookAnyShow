package com.bookanyshow.service.movieservice;

import com.bookanyshow.dtos.CreateMovieDTO;
import com.bookanyshow.model.Movie;
import com.bookanyshow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> searchMovies(){
        return movieRepository.findAll();
    }

    public Movie findMovieByName(String movieName){
        return movieRepository.findMovieByName(movieName);
    }
//    public Movie searchMovieByName(String movieName) {
//        Optional<Movie> movie = movieRepository.findByName
//        if (movie.isEmpty()) {
//            throw new RuntimeException("Movie name does not exist!");
//        }
//        return movie.get();
//    }

    public Movie addMovie(CreateMovieDTO movieRequest){
        Movie movie = Movie.builder().name(movieRequest.getName()).movieLanguage(movieRequest.getLanguage()).catagory(movieRequest.getCatagory()).releaseDate(movieRequest.getReleaseDate()).build();
        return movieRepository.save(movie);
    }
}
