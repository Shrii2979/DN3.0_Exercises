package com.example.bookstoreapi.service;

import com.example.bookstoreapi.dto.BookDTO;
import com.example.bookstoreapi.exception.ResourceNotFoundException;
import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ModelMapper modelMapper;

    // Convert Book entity to BookDTO
    public BookDTO convertToDto(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    // Convert BookDTO to Book entity
    public Book convertToEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, Book.class);
    }

    // Get all books
    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    // Get a book by its ID
    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
        return convertToDto(book);
    }

    // Create a new book
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = convertToEntity(bookDTO);
        Book savedBook = bookRepository.save(book);
        return convertToDto(savedBook);
    }

    // Update an existing book
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));

        // Update fields
        existingBook.setTitle(bookDTO.getTitle());
        existingBook.setAuthor(bookDTO.getAuthor());
        existingBook.setPrice(bookDTO.getPrice());
        existingBook.setIsbn(bookDTO.getIsbn());

        Book updatedBook = bookRepository.save(existingBook);
        return convertToDto(updatedBook);
    }

    // Delete a book
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
        bookRepository.delete(book);
    }

    // Search books by title and author
    public List<BookDTO> searchBooks(String title, String author) {
        List<Book> books = bookRepository.findByTitleContainingAndAuthorContaining(title, author);
        return books.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
}
