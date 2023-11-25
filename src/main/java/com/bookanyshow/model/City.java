package com.bookanyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@Entity
public class City {
    @Id
    @GeneratedValue
    int id;
    String name;
    String state;
    String country;
}
