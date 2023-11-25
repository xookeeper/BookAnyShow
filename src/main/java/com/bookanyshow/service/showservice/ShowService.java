package com.bookanyshow.service.showservice;

import com.bookanyshow.dtos.CreateShowDTO;
import com.bookanyshow.model.MovieShow;
import com.bookanyshow.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    ShowRepository showRepository;

    public List<MovieShow> getShows(Long movieId){
        return showRepository.findByMovieId(movieId);
    }


    public MovieShow addShow(CreateShowDTO showRequest){
        MovieShow movieShow = MovieShow.builder().movieId(showRequest.getMovieId())
                                                 .showTime(showRequest.getTime())
                                                 .screenId(showRequest.getScreenId())
                                                 .showStatus(MovieShow.ShowStatus.SCHEDULED)
                                                 .startTime(showRequest.getStartTime())
                                                 .build();
        showRepository.save(movieShow);
        return movieShow;
    }
}
