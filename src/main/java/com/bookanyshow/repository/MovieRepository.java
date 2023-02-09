package com.bookanyshow.repository;

import com.bookanyshow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Optional<Movie> findByName(String name);
}
