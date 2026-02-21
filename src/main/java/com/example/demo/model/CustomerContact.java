package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_contact")
public class CustomerContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;

    @Embedded
    private PersonalInformation personalInformation;

    @Embedded
    private Address address;

    @Embedded
    private BusinessInformation businessInformation;

    @Column(length = 1000)
    private String description;

    private String preferredContactMethod;
    private String registrationSource;
    private String status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // No-argument constructor
    public CustomerContact() {
    }

    // Parameterized constructor
    public CustomerContact(String customerId, PersonalInformation personalInformation,
                           Address address, BusinessInformation businessInformation,
                           String description, String preferredContactMethod,
                           String registrationSource, String status,
                           LocalDateTime createdAt, LocalDateTime updatedAt) {

        this.customerId = customerId;
        this.personalInformation = personalInformation;
        this.address = address;
        this.businessInformation = businessInformation;
        this.description = description;
        this.preferredContactMethod = preferredContactMethod;
        this.registrationSource = registrationSource;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public PersonalInformation getPersonalInfo() {
        return personalInformation;
    }

    public void setPersonalInfo(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BusinessInformation getBusinessInfo() {
        return businessInformation;
    }

    public void setBusinessInfo(BusinessInformation businessInformation) {
        this.businessInformation = businessInformation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }

    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public String getRegistrationSource() {
        return registrationSource;
    }

    public void setRegistrationSource(String registrationSource) {
        this.registrationSource = registrationSource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
