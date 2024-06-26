package com.example.librarysystem.domain.service;

import com.example.librarysystem.domain.model.Author;
import com.example.librarysystem.domain.model.Book;
import com.example.librarysystem.domain.model.Category;
import com.example.librarysystem.domain.model.Publisher;
import com.example.librarysystem.domain.repository.AuthorRepository;
import com.example.librarysystem.domain.repository.BookRepository;
import com.example.librarysystem.domain.repository.CategoryRepository;
import com.example.librarysystem.domain.repository.PublisherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository,
                       CategoryRepository categoryRepository,
                       PublisherRepository publisherRepository,
                       AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.categoryRepository = categoryRepository;
        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional(readOnly = true)
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public Book createBook(Book book) {
        // Validar se a categoria existe
        Category category = categoryRepository.findById(book.getCategory().getId())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        book.setCategory(category);

        // Validar se a editora existe
        Publisher publisher = publisherRepository.findById(book.getPublisher().getId())
                .orElseThrow(() -> new RuntimeException("Publisher not found"));
        book.setPublisher(publisher);

        // Validar e associar autores
        Set<Author> authors = new HashSet<>();
        for (Author author : book.getAuthors()) {
            Author existingAuthor = authorRepository.findById(author.getId())
                    .orElseThrow(() -> new RuntimeException("Author not found"));
            authors.add(existingAuthor);
        }
        book.setAuthors(authors);

        return bookRepository.save(book);
    }

}
