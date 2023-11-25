package com.bookanyshow.controller.v1;

import com.bookanyshow.dtos.CreateShowDTO;
import com.bookanyshow.model.MovieShow;
import com.bookanyshow.service.showservice.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/shows")
public class ShowController {

    @Autowired
    ShowService showService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<MovieShow> getShows(@RequestParam(value = "movieID", required = false) Long movieId){
        return showService.getShows(movieId);
    }
    @RequestMapping(value = "", method = RequestMethod.POST)
    public MovieShow addShow(CreateShowDTO showRequest){
        return showService.addShow(showRequest);
    }
}
