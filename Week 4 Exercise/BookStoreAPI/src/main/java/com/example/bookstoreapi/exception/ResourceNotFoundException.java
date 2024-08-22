package com.example.bookstoreapi.exception;

import java.io.Serializable;

public class ResourceNotFoundException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L; // Add serialVersionUID

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
