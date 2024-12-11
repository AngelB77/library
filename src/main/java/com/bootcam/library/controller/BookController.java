package com.bootcam.library.controller;

import com.bootcam.library.model.Book;
import com.bootcam.library.service.BookService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getAllBooks() {
        return bookService.getAll();
    }
}
