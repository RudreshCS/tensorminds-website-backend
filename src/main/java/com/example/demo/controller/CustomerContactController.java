package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.CustomerContact;
import com.example.demo.service.CustomerContactService;

@RestController
@RequestMapping("/api")
public class CustomerContactController {

    private final CustomerContactService service;

    public CustomerContactController(CustomerContactService service) {
        this.service = service;
    }

    @PostMapping("/contact")
    public CustomerContact createContact(
            @RequestBody CustomerContact contact) {

        return service.save(contact);
    }
}