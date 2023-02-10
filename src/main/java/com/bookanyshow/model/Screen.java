package com.bookanyshow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Screen {
    @GeneratedValue
    @Id
    Long id;
    String name;
    Long theatreId;

    @ManyToMany
    List<MovieShow> movieShows;

}
