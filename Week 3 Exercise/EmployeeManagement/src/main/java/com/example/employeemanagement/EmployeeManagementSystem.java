package com.example.employeemanagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.example.employeemanagement.repository")
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystem.class, args);
    }
}