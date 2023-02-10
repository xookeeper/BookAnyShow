package com.bookanyshow.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Data
@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @GeneratedValue
    @Id
    Long id;
    String name;
    Long releaseDate;
    String catagory;
    String movieLanguage;
}
