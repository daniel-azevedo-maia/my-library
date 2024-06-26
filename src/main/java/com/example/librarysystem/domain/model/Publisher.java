package com.example.librarysystem.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Embedded
    private Address address;

    private String website;

    @JsonIgnore
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();
}
