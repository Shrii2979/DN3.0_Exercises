package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Example method that uses bookRepository
    public void performSomeService() {
        System.out.println("Service is running...");
        bookRepository.someRepositoryMethod();
    }
}
