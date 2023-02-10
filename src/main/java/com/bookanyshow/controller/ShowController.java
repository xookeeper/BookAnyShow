package com.bookanyshow.controller;

import com.bookanyshow.dtos.CreateShowDTO;
import com.bookanyshow.model.MovieShow;
import com.bookanyshow.service.showservice.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ShowController {

    @Autowired
    ShowService showService;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<MovieShow> getShows(@RequestParam(value = "movieID", required = false) Long movieId){
        return showService.getShows(movieId);
    }
    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public MovieShow addShow(CreateShowDTO showRequest){
        return showService.addShow(showRequest);
    }
}
