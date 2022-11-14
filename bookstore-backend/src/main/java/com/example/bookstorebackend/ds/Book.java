package com.example.bookstorebackend.ds;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String authorName;
    private double price;
    private String publisher;
    private LocalDate yearPublished;
    private String genre;
    private String imageUrl;

    public Book(){

    }

    public Book(String title, String authorName, double price, String publisher, LocalDate yearPublished, String genre, String imageUrl) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }
}
