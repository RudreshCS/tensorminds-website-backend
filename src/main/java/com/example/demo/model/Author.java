package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Author {

    @Id
    @NotBlank
    private String authorId;

    @NotBlank
    private String authorName;

    private String authorDesignation;

    public Author() {}

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDesignation() {
        return authorDesignation;
    }

    public void setAuthorDesignation(String authorDesignation) {
        this.authorDesignation = authorDesignation;
    }
}
