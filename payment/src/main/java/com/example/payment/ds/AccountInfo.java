package com.example.payment.ds;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccountInfo {
    private String name;
    private double totalAmount;
    private String accountNumber;
}
