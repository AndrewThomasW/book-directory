package com.example.bookdirectory.controller;

import com.example.bookdirectory.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/")
    public Book getBook(){
        return new Book(123,"Rich Dad Poor Dad");
    }
}
