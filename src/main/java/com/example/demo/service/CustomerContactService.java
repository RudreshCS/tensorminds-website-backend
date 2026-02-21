package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.CustomerContact;
import com.example.demo.repository.CustomerContactRepository;

import java.time.LocalDateTime;

@Service
public class CustomerContactService {

    private final CustomerContactRepository repository;

    public CustomerContactService(CustomerContactRepository repository) {
        this.repository = repository;
    }

    public CustomerContact save(CustomerContact contact) {
        contact.setCreatedAt(LocalDateTime.now());
        contact.setUpdatedAt(LocalDateTime.now());
        return repository.save(contact);
    }
}