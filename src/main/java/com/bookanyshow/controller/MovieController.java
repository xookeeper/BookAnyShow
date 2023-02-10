package com.bookanyshow.controller;

import com.bookanyshow.dtos.CreateMovieDTO;
import com.bookanyshow.model.Movie;
import com.bookanyshow.service.movieservice.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> getMovies(){
        return movieService.searchMovies();
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public Movie getMovie(@RequestParam(value = "movieName", required = true) String movieName){
        return movieService.findMovieByName(movieName);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public Movie addMovie(@RequestBody CreateMovieDTO movieRequest){
        return movieService.addMovie(movieRequest);
    }
}
