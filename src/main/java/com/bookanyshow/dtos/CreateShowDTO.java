package com.bookanyshow.dtos;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateShowDTO {
    @NonNull
    Long movieId;

    @NonNull
    Long time;

    @NonNull
    Long screenId;
}
