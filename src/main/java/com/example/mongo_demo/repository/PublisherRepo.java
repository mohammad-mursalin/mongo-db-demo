package com.example.mongo_demo.repository;

import com.example.mongo_demo.model.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepo extends MongoRepository<Publisher, String> {
}
