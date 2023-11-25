package com.bookanyshow.service.screenservice;

import com.bookanyshow.dtos.CreateScreenDTO;
import com.bookanyshow.model.MovieShow;
import com.bookanyshow.model.Screen;
import com.bookanyshow.repository.ScreenRepository;
import com.bookanyshow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ScreenService {

    @Autowired
    ScreenRepository screenRepository;

    @Autowired
    ShowRepository showRepository;

    public List<Screen> findScreensByMovieId(Long movieId){
        List<MovieShow> shows = showRepository.findByMovieId(movieId);
        List<Screen> screens = new ArrayList<>();
        for(MovieShow show : shows){
            Optional<Screen> screen = screenRepository.findById(show.getScreenId());
            if(!screen.isEmpty()){
                screens.add(screen.get());
            }
        }
        return screens;
    }

    public Screen addScreen(CreateScreenDTO screenRequest){
        Screen screen = Screen.builder().name(screenRequest.getName())
                                        .theatreId(screenRequest.getTheaterId())
                                        .build();
        screenRepository.save(screen);
        return screen;
    }
}
