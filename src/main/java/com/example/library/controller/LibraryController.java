package com.example.library.controller;

import com.example.library.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {

    private final BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }
}
