package com.library.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<String> books = new ArrayList<>();

    public List<String> findAllBooks() {
        // Simulate some processing
        return books;
    }

    public void addBook(String book) {
        books.add(book);
        // Simulate some processing
    }
}
