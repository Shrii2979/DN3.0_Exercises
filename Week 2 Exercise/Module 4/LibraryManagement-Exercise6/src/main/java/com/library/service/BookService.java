package com.library.service;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor injection for BookRepository
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performSomeService() {
        System.out.println("Service is running...");
        bookRepository.someRepositoryMethod();
    }
}
