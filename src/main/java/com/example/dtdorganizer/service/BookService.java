package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    Optional<Book> getBookById(String Id);
    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBook(String Id);
}
