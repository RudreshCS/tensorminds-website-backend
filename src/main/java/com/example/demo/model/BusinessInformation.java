package com.example.demo.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class BusinessInformation {
    private String companyName;
    private String designation;
    private String industry;
    private String companyWebsite;
    private String companySize;

    // No-argument constructor
    public BusinessInformation() {
    }

    // Parameterized constructor
    public BusinessInformation(String companyName, String designation, String industry,
                        String companyWebsite, String companySize) {
        this.companyName = companyName;
        this.designation = designation;
        this.industry = industry;
        this.companyWebsite = companyWebsite;
        this.companySize = companySize;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }
}