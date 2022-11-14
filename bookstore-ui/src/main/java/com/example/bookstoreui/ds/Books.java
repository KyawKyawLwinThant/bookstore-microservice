package com.example.bookstoreui.ds;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Getter
@Setter
@ToString
public class Books {

    private List<Book> books=
            new LinkedList<>();

    public Books(){}

    public Books(Iterable<Book> books){
        this.books= StreamSupport
                .stream(books.spliterator(), false)
                .collect(Collectors.toList());
    }


}
