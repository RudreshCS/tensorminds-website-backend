package com.example.demo.controller;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;

@RestController
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page!";
    }

    @PostMapping("/blog")
    public Blog createBlog(@Valid @RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }


}
