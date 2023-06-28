package com.visionpragma.khusiharmony.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import  jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Tenant customer;

    private double amount;

    private LocalDate generatedDate;

    private LocalDate dueDate;

    public Bill() {
    }

    public Bill(Tenant customer, double amount, LocalDate generatedDate, LocalDate dueDate) {
        this.customer = customer;
        this.amount = amount;
        this.generatedDate = generatedDate;
        this.dueDate = dueDate;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // ...
}
