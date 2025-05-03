package com.example.mongo_demo.controller;

import com.example.mongo_demo.model.Book;
import com.example.mongo_demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add-book")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping("/get-books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}
