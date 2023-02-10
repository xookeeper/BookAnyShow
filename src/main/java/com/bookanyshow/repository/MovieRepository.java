package com.bookanyshow.repository;

import com.bookanyshow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

    Movie findMovieByName(String name);


//    final Map<String, Movie> movies = new HashMap<>();
//    public Optional<Movie> findByName(String name){
//        return Optional.ofNullable(movies.get(name));
//    }
//
//    public Map<String, Movie> findAll(){
//        return movies;
//    }
//
//    public Movie addMovie(Movie movie){
//        movies.put(movie.getName(), movie);
//        return movie;
//    }

//    public Movie save(Movie movie){
//        return null;
//    }
//
//    public List<Movie> findAll(){
//        return null;
//    }
}
