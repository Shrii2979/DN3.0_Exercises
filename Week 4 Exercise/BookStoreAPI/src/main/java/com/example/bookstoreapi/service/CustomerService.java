package com.example.bookstoreapi.service;

import com.example.bookstoreapi.dto.CustomerDTO;
import com.example.bookstoreapi.model.Customer;
import com.example.bookstoreapi.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public CustomerDTO convertToDto(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public Customer convertToEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = convertToEntity(customerDTO);
        Customer savedCustomer = customerRepository.save(customer);
        return convertToDto(savedCustomer);
    }
}
