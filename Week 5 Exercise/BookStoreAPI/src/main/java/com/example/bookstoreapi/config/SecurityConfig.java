package com.example.bookstoreapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Use the recommended way to disable CSRF protection
            .csrf(csrf -> csrf.disable())
            
            // Configure authorization requests
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/books/**", "/customers/**").authenticated()
            )
            
            // Configure HTTP Basic Authentication using a new method
            .httpBasic(Customizer.withDefaults());


        return http.build();
    }

    private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefaults() {
		
		return null;
	}

	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
