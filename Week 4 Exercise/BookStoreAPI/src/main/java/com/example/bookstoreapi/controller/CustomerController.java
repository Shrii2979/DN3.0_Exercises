package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.dto.CustomerDTO;
import com.example.bookstoreapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerService.createCustomer(customerDTO));
    }

    @PostMapping("/register")
    public ResponseEntity<CustomerDTO> registerCustomer(@RequestParam String name,
                                                        @RequestParam String email) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(name);
        customerDTO.setEmail(email);
        return ResponseEntity.ok(customerService.createCustomer(customerDTO));
    }
}
