package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryApplication{

    public static void main(String[] args) {
        // Load the Spring application context
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService bookService = context.getBean(BookService.class);

        // Call methods on the BookService to see logging
        bookService.findAllBooks(); // Example method to log
        bookService.addBook("New Book"); // Another method to log
    }
}
