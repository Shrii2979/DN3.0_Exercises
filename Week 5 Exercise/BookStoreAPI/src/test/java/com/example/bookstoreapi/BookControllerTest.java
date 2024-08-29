package com.example.bookstoreapi;

import com.example.bookstoreapi.controller.BookController;
import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldReturnBookById() throws Exception {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Sample Book");
        book.setAuthor("Author Name");
        book.setPrice(19.99);

        Mockito.when(bookService.getBookById(1L)).thenReturn(java.util.Optional.of(book));

        mockMvc.perform(get("/books/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Sample Book"))
                .andExpect(jsonPath("$.author").value("Author Name"));
    }

    
}
