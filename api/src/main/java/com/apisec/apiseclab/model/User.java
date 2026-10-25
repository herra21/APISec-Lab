package com.apisec.apiseclab.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "user")
    List<Order> orders;
}
