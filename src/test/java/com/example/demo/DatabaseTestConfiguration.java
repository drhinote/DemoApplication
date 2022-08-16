package com.example.demo;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class DatabaseTestConfiguration {
    @Bean
    @Primary
    public DatabaseInterface database() {
        return Mockito.mock(DatabaseInterface.class);
    }
}