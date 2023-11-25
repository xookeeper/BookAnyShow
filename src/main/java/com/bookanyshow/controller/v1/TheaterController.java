package com.bookanyshow.controller.v1;

import com.bookanyshow.dtos.CreateTheatreDTO;
import com.bookanyshow.model.Theatre;
import com.bookanyshow.service.theaterservice.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TheaterController {

    @Autowired
    TheatreService theatreService;

    @RequestMapping(value = "/theatres", method = RequestMethod.GET)
    public List<Theatre> getTheatres(@RequestParam(value = "movieId", required = true) Long movieId){
        return theatreService.getTheatres(movieId);
    }

    @RequestMapping(value = "/theatres", method = RequestMethod.POST)
    public Theatre addTheatre(@RequestBody CreateTheatreDTO theatreRequest){
        return theatreService.addTheatre(theatreRequest);
    }
}
