package com.example.mongo_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Publisher {

    @Id
    private String id;
    private String publisher_name;
    private String publisher_company;
}
