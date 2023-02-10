package com.bookanyshow.dtos;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateScreenDTO {

    @NonNull
    String name;

    @NonNull
    Long theaterId;

}
