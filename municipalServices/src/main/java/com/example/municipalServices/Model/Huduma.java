package com.example.municipalServices.Model;

import jakarta.persistence.*;

@Entity
public class Huduma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Remove `nullable = false` so fee can be null
    @Column
    private Double fee;

    // Constructors
    public Huduma() {}

    public Huduma(String name, Double fee) {
        this.name = name;
        this.fee = fee;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getFee() { return fee; }
    public void setFee(Double fee) { this.fee = fee; }

    public void setId(Long id) {
        this.id = id;
    }
}
