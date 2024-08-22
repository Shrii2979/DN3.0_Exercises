package com.example.bookstoreapi.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
	private String name;

    @SuppressWarnings("unused")
	private String email;

    public Customer() {}

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
