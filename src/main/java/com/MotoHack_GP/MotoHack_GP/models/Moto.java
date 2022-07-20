package com.MotoHack_GP.MotoHack_GP.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "motos")
public class Moto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String brand;
    private String model;
    private String image;
    private String location;
    private Integer prodYear;
    private Integer cc;
    private String hp;
    private Integer km;
    private Double price;
    private Boolean isFavorite;
    private Boolean isClassic;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;
}
