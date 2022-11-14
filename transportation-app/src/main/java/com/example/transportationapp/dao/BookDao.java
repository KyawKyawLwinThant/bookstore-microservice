package com.example.transportationapp.dao;

import com.example.transportationapp.ds.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
