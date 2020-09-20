package com.guru.SpringbootWebApplication.controller;

import com.guru.SpringbootWebApplication.models.Author;
import com.guru.SpringbootWebApplication.repositories.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {

    BookRepo bookRepo;

    public BooksController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepo.findAll());
        return "books";

    }

}
