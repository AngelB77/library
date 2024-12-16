package com.bootcam.library.controller;

import com.bootcam.library.model.Book;
import com.bootcam.library.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }
    @PostMapping("/books")
    public void createBook(@RequestBody Book newBook) {
        bookService.addBook(newBook);
    }
}
