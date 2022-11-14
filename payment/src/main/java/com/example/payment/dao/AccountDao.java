package com.example.payment.dao;

import com.example.payment.ds.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountDao extends JpaRepository<Account,Integer> {



    Optional<Account> findAccountByNameAndAccountNumber(String name,
                                                        String accountNumber);

    Optional<Account> findAccountByAccountNumber(String accountNumber);
}
