package com.example.dtdorganizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "books")
public class Book {
    @Id
    public String isbn;
    public String title;


    @ElementCollection(targetClass = String.class)
    @Column(name = "authors")
    private Collection<String> authors;

    public int pages;
    public String description;
    public String publisher;
    public String publishedDate;
    public float rating;
    public String imagePath;
    public int Qty;
}
