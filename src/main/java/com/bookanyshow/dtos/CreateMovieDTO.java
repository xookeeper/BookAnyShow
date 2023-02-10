package com.bookanyshow.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
public class CreateMovieDTO {
    @NonNull
    String name;
    String catagory;
    String language;

    Long releaseDate;
}
