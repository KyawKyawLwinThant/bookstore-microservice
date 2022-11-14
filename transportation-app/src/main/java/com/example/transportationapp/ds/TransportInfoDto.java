package com.example.transportationapp.ds;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class TransportInfoDto {


    private String name;
    private String orderId;

    private double total;

    private List<BookDto> books=new ArrayList<>();

    public TransportInfoDto(){

    }





}
