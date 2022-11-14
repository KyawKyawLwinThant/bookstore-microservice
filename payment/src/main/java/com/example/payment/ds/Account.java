package com.example.payment.ds;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String accountNumber;
    private double amount;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    public Account(){}

    public Account(String name, String accountNumber, double amount, AccountType accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountType = accountType;
    }
}
