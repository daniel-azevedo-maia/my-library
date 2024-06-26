package com.example.librarysystem.domain.service;

import com.example.librarysystem.domain.model.Publisher;
import com.example.librarysystem.domain.repository.PublisherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher createPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}
