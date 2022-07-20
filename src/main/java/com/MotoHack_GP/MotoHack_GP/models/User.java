package com.MotoHack_GP.MotoHack_GP.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String avatar;
    @JsonIgnore
    private String mail;
    @JsonIgnore
    private String password;
}
