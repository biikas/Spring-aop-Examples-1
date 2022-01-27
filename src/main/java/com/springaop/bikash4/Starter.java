package com.springaop.bikash4;

import com.springaop.bikash4.model.bank.Bank;
import com.springaop.bikash4.model.bank.customer.Customer;
import com.springaop.bikash4.model.bank.customerController.CustomerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    private Customer customer;

    @Autowired
    private CustomerController customerController;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(customer.getAccountNumber());

        customerController.save();
        //customerController.read();

        //System.out.println(customerController.checkMoney());
        customerController.checkMoney();

    }
}
