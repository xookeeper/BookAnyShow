package com.bookanyshow.model;

import lombok.Data;

@Data
public class Seat {
    int id;
    int row;
    int col;
    String status;
}
