package com.example.mongo_demo.service;

import com.example.mongo_demo.model.Book;
import com.example.mongo_demo.model.Publisher;
import com.example.mongo_demo.model.Writing;
import com.example.mongo_demo.repository.BookRepository;
import com.example.mongo_demo.repository.PublisherRepo;
import com.example.mongo_demo.repository.WritingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    WritingRepo writingRepo;

    @Autowired
    PublisherRepo publisherRepo;

    public void addBook(Book book) {

        Writing writing = new Writing("12", 10);
        Publisher publisher = new Publisher("21", "laon", "xyz");
        book.setPublisher(publisher);
        book.setWriting(writing);

        writingRepo.save(writing);
        publisherRepo.save(publisher);

        bookRepository.save(book);

        getBooks().forEach(System.out::println);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
