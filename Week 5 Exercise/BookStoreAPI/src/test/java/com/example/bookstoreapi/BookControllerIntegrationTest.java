package com.example.bookstoreapi;

import com.example.bookstoreapi.model.Book;
import org.springframework.security.test.context.support.WithMockUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerIntegrationTest {

    @org.springframework.boot.test.web.server.LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @WithMockUser(username = "user", roles = {"USER"})
    public void shouldReturnAllBooks() {
        ResponseEntity<Book[]> response = restTemplate.getForEntity("http://localhost:" + port + "/books", Book[].class);
        assertThat(response.getBody()).isNotEmpty();
    }

   
}
