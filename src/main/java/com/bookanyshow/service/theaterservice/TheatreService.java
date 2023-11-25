package com.bookanyshow.service.theaterservice;

import com.bookanyshow.dtos.CreateTheatreDTO;
import com.bookanyshow.model.MovieShow;
import com.bookanyshow.model.Screen;
import com.bookanyshow.model.Theatre;
import com.bookanyshow.repository.ScreenRepository;
import com.bookanyshow.repository.ShowRepository;
import com.bookanyshow.repository.TheatreRepository;
import com.bookanyshow.service.screenservice.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    ScreenService screenService;

    @Autowired
    ScreenRepository screenRepository;

    public List<Theatre> getTheatres(Long movieId){
        List<Screen> screens = screenService.findScreensByMovieId(movieId);
        List<Theatre> theatres = new ArrayList<>();

        for(Screen screen : screens){
            Optional<Theatre> theatre = theatreRepository.findById(screen.getTheatreId());
            if(!theatre.isEmpty()){
                theatres.add(theatre.get());
            }
        }

        return theatres;

    }

    public Theatre addTheatre(CreateTheatreDTO theatreRequest){
        Theatre theatre = Theatre.builder().name(theatreRequest.getName())
                                           .city(theatreRequest.getCity())
                                           .address(theatreRequest.getAddress())
                                           .build();
        theatreRepository.save(theatre);
        return theatre;
    }

}
