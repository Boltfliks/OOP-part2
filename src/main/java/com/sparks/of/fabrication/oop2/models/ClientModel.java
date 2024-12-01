package com.sparks.of.fabrication.oop2.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "client_model")
@Getter
@Setter
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @ToString.Include
    private String name;

    @Column(nullable = false)
    @ToString.Include
    private String email;

    @Column(nullable = false)
    private String password;

    @JoinColumn(nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private CartModel cart;
}