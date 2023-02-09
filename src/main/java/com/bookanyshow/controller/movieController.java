package com.bookanyshow.controller;

import com.bookanyshow.model.Movie;
import com.bookanyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class movieController {
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> getMovies(){
        return movieService.searchMovies();
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public Movie getMovie(@RequestParam(value = "movieName", required = true) String movieName){
        return movieService.searchMovieByName(movieName);
    }
}
