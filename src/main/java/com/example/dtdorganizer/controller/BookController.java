package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.Book;
import com.example.dtdorganizer.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //get book
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    //get book by id
    @GetMapping("/books/{id}")
    public Optional<Book> getBookById(@PathVariable String id){
        return this.bookService.getBookById(id);
    }
    //save book
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){
        return this.bookService.createBook(book);
    }
    //update book

    //delete book
    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable String Id){
        this.bookService.deleteBook(Id);
    }

}
