package com.bookanyshow.dtos;

import lombok.Data;
import lombok.NonNull;

import java.time.ZonedDateTime;

@Data
public class CreateShowDTO {
    @NonNull
    Long movieId;

    @NonNull
    Long screenId;

    @NonNull
    Long time;

    ZonedDateTime startTime;

}
