package com.apisec.apiseclab.model;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private float weight;
    private float price;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
