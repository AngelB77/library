package com.bootcam.library.service;

import com.bootcam.library.model.Book;
import com.bootcam.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    public Book addBook(Book newBook){
        return bookRepository.save(newBook);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}

