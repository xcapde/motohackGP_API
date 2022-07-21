package com.MotoHack_GP.MotoHack_GP.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MotoRequestDto {
    private String brand;
    private String model;
    private String image;
    private String location;
    private String description;
    private Integer prodYear;
    private Integer cc;
    private String hp;
    private Integer km;
    private Double price;
    private Boolean isFavorite;
    private Boolean isClassic;
    private Boolean isEco;
}
