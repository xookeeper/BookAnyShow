package com.bookanyshow.dtos;

import lombok.Data;
import lombok.NonNull;

import java.time.ZonedDateTime;

@Data
public class CreateShowDTO {

    Long movieId;

    Long screenId;

    ZonedDateTime startTime;

}
