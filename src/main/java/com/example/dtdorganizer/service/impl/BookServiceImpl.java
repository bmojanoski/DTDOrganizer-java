package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.BookModel;
import com.example.dtdorganizer.repository.BookRepository;
import com.example.dtdorganizer.repository.UserRepository;
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
    public List<BookModel> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<BookModel> getBookById(String Id) {
        return this.bookRepository.findById(Id);
    }

    @Override
    public BookModel createBook(BookModel book) {
        return this.bookRepository.save(book);
    }

    @Override
    public BookModel updateBook(BookModel book) {
        return null;
    }

    @Override
    public void deleteBook(String id) {
        this.bookRepository.deleteById(id);
    }
}
