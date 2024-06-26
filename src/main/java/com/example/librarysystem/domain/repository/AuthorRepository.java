package com.example.librarysystem.domain.repository;

import com.example.librarysystem.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
