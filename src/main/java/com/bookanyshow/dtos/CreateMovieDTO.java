package com.bookanyshow.dtos;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateMovieDTO {
    @NonNull
    String name;
}
