package com.example.librarysystem.domain.service;

import com.example.librarysystem.domain.model.Author;
import com.example.librarysystem.domain.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public Author update(Long id, Author updatedAuthor) {
        return authorRepository.findById(id).map(author -> {
            author.setName(updatedAuthor.getName());
            return authorRepository.save(author);
        }).orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public void delete(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found"));
        authorRepository.delete(author);
    }
}