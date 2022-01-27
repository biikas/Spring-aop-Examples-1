package com.springaop.bikash4.model.bank.customer;

import org.springframework.stereotype.Component;


public interface CustomerInterface {
    int deposit(int depositMoney);
    int withdraw(int withdrawMoney);
    int checkBalance();

}
