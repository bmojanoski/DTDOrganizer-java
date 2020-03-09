package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.BookModel;
import com.example.dtdorganizer.model.User;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookModel> getAllBooks();
    Optional<BookModel> getBookById(String Id);
    BookModel createBook(BookModel book);
    BookModel updateBook(BookModel book);
    void deleteBook(String id);
}
