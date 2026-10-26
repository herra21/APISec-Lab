package com.apisec.apiseclab.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String dni;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "user")
    List<Order> orders;
}
