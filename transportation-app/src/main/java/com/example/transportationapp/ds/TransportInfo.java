package com.example.transportationapp.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Setter
@Getter
@Entity
public class TransportInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String orderId;

    private double total;
    @OneToMany(mappedBy = "transportInfo")
    private List<Book> bookList=new ArrayList<>();

    public TransportInfo(){

    }

    public void addBook(Book book){
        book.setTransportInfo(this);
        bookList.add(book);
    }

    public TransportInfo(String name, String orderId, double total) {
        this.name = name;
        this.orderId = orderId;
        this.total = total;
    }


}
