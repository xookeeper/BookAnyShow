package com.bookanyshow.service.movieservice;

import com.bookanyshow.dtos.CreateMovieDTO;
import com.bookanyshow.model.Movie;
import com.bookanyshow.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Movie findMovieByName(String movieName){
        return movieRepository.findMovieByName(movieName);
    }

    public Movie addMovie(CreateMovieDTO movieRequest){
        Movie movie = Movie.builder().name(movieRequest.getName())
                                     .movieLanguage(movieRequest.getLanguage())
                                     .catagory(movieRequest.getCatagory())
                                     .releaseDate(movieRequest.getReleaseDate())
                                     .build();
        return movieRepository.save(movie);
    }

    public Movie findMovieById(Long movieId) {
        return movieRepository.findById(movieId).orElseThrow(() -> new RuntimeException("Movie id does not exist!"));
    }

    public List<Movie> searchMovies(){
        return movieRepository.findAll();
    }
}
