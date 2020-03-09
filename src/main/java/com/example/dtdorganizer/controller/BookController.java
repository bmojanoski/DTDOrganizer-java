package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.BookModel;
import com.example.dtdorganizer.model.User;
import com.example.dtdorganizer.service.BookService;
import com.example.dtdorganizer.service.UserService;
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

    //get users
    @GetMapping("/books")
    public List<BookModel> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    //get user by id
    @GetMapping("/books/{id}")
    public Optional<BookModel> getBookById(@PathVariable String Id){
        return this.bookService.getBookById(Id);
    }
    //save user
    @PostMapping("/books")
    public BookModel createBook(@RequestBody BookModel book){
        return this.bookService.createBook(book);
    }
    //update user

    //delete user
    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable String Id){
        this.bookService.deleteBook(Id);
    }

}
