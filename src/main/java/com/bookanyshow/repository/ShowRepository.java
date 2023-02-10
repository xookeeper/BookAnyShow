package com.bookanyshow.repository;

import com.bookanyshow.model.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<MovieShow, Long> {
    List<MovieShow> findByMovieId(Long movieId);
}
