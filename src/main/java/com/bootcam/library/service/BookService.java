package com.bootcam.library.service;

import com.bootcam.library.model.Book;
import com.bootcam.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Book> findBook(int id){
        return bookRepository.findById(id);
    }

    public Book updatedBook(int id, Book updatedBook){
        Optional<Book> foundBook = bookRepository.findById(id);

        if(foundBook.isPresent()){
            Book existingBook = foundBook.get();

            existingBook.setTitulo(updatedBook.getTitulo());
            existingBook.setDescription(updatedBook.getDescription());
            existingBook.setId(updatedBook.getId());
            existingBook.setAutores(updatedBook.getAutores());
            existingBook.setGenerosLiterarios(updatedBook.getGenerosLiterarios());

            return bookRepository.save(existingBook);
        }

        throw new RuntimeException("Book not found with id: " + id);
    }
}

