package com.example.librarysystem.api.controller;

import com.example.librarysystem.domain.model.Author;
import com.example.librarysystem.domain.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }

    @PostMapping
    public Author createAuthor(@Valid @RequestBody Author author) {
        return authorService.save(author);
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @Valid @RequestBody Author updatedAuthor) {
        return authorService.update(id, updatedAuthor);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.delete(id);
    }
}