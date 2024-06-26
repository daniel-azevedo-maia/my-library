package com.example.librarysystem.domain.repository;


import com.example.librarysystem.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
