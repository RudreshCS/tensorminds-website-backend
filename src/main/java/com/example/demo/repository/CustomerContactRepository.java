package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.CustomerContact;

public interface CustomerContactRepository
        extends JpaRepository<CustomerContact, Long> {
}
