package com.tecdesoftware.donut_app_backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que el valor de este campo se generará automáticamente
    private Long id;
    private String name;


    @OneToMany (mappedBy = "category")
    private List<Product> products;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
