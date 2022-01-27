package com.springaop.bikash4.model.bank.customer;

import com.springaop.bikash4.model.bank.Bank;
import org.springframework.stereotype.Component;

@Component
public class Customer extends Bank {
    private String firstname;
    private String lastname;
    private String accountNumber;
    private int balance;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
