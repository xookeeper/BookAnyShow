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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Theatre {

    @GeneratedValue
    @Id
    int id;
    String name;
    String city;
    String address;

    @OneToMany
    List<Screen> screens;

}
