package com.example.librarysystem.domain.repository;

import com.example.librarysystem.domain.model.Member;
import com.example.librarysystem.domain.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {}