package com.example.bookstorebackend.dao;

import com.example.bookstorebackend.ds.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
