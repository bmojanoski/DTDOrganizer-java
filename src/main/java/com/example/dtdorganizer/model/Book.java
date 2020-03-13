package com.example.dtdorganizer.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="books")
public class Book {
    @Id
    public String isbn;
    public String title;


    @ElementCollection(targetClass=String.class)
    @Column(name="authors")
    private Collection<String> authors;

    public int pages;
    public String description;
    public String publisher;
    public String publishedDate;
    public float rating;
    public String imagePath;
    public int Qty;

    public Book() {
        super();
    }
    public Book(String  isbn, String title, Collection<String> authors, int pages, String description, String publisher, String publishedDate, float rating, String imagePath, int Qty) {
        this.isbn = isbn;
        this.title=title;
        this.authors=authors;
        this.pages=pages;
        this.description = description;
        this.publishedDate = publishedDate;
        this.publisher = publisher;
        this.rating=rating;
        this.imagePath=imagePath;
        this.Qty=Qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<String> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<String> authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }
}
