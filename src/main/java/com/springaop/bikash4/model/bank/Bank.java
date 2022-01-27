package com.springaop.bikash4.model.bank;

import org.springframework.stereotype.Component;

@Component
public class Bank {
    public static final String bankName="Bikash Bank limited";
    public void displayBank(){
        System.out.println(bankName);
    }

}
