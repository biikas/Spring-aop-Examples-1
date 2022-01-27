package com.springaop.bikash4.model.bank.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl extends Customer implements CustomerInterface {
    @Override
    public int deposit(int depositMoney) {
        return depositMoney + getBalance();
    }

    @Override
    public int withdraw(int withdrawMoney) {
        return getBalance()-withdrawMoney;
    }

    @Override
    public int checkBalance() {
        return getBalance();
    }


}
