package com.bookanyshow.controller.v1;

import com.bookanyshow.dtos.CreateMovieDTO;
import com.bookanyshow.dtos.UpdateMovieDTO;
import com.bookanyshow.model.Movie;
import com.bookanyshow.service.movieservice.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/movies")
@Slf4j
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Movie movie(@RequestBody CreateMovieDTO movieRequest){
        return movieService.addMovie(movieRequest);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Movie> findAllMovies(){
        return movieService.searchMovies();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Movie findMovieById(@RequestParam Long movieId){
        return movieService.findMovieById(movieId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Movie updateMovieById(@RequestParam Long movieId){
        return movieService.findMovieById(movieId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Movie deleteMovieById(@RequestParam Long movieId, @RequestBody UpdateMovieDTO updateMovieDTO){
        return movieService.findMovieById(movieId);
    }

    public Movie findMovieByName(String movieName){
        return movieService.findMovieByName(movieName);
    }

}
