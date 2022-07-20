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

}
