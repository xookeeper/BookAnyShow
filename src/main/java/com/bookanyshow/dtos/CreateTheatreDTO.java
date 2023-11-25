package com.bookanyshow.dtos;

import lombok.Data;
import lombok.NonNull;

@Data
public class CreateTheatreDTO {

    @NonNull
    String name;

    @NonNull
    String cityId;

    String address;

    String city;
}
