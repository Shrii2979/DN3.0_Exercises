package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingAndAuthorContaining(String title, String author);
}
