package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Book;
import com.example.dtdorganizer.repository.BookRepository;
import com.example.dtdorganizer.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(String Id) {
        return this.bookRepository.findById(Id);
    }

    @Override
    public Book createBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }

    @Override
    public void deleteBook(String id) {
        this.bookRepository.deleteById(id);
    }
}
