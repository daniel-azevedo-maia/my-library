package com.example.librarysystem.api.controller;

import com.example.librarysystem.domain.model.Publisher;
import com.example.librarysystem.domain.service.PublisherService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publishers")
public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @PostMapping
    public Publisher createPublisher(@Valid @RequestBody Publisher publisher) {
        return publisherService.createPublisher(publisher);
    }
}
