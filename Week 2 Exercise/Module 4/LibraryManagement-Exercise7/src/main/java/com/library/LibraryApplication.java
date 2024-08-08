package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApplication {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bookService bean
        BookService bookService = context.getBean(BookService.class);

        // Test the configuration by calling a method on bookService
        bookService.performSomeService();

        // Close the context if necessary
        ((ClassPathXmlApplicationContext) context).close();
    }
}
