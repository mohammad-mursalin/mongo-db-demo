package com.example.mongo_demo.repository;

import com.example.mongo_demo.model.Writing;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WritingRepo extends MongoRepository<Writing, String> {
}
