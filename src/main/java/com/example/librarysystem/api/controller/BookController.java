package com.example.librarysystem.api.controller;

import com.example.librarysystem.domain.model.Book;
import com.example.librarysystem.domain.service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@Valid @RequestBody Book book) {
        return bookService.createBook(book);
    }
}
