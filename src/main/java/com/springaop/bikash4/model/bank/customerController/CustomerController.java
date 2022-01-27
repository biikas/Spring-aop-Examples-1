package com.springaop.bikash4.model.bank.customerController;

import com.springaop.bikash4.model.bank.Bank;
import com.springaop.bikash4.model.bank.customer.Customer;
import com.springaop.bikash4.model.bank.customer.CustomerServiceImpl;
import com.springaop.bikash4.model.bank.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerServiceImpl customerServiceimpl;


    public void save(){

        customerService.save();
        customerServiceimpl.displayBank();


    }

    public void read() {

        customerService.read();
        customerServiceimpl.displayBank();

    }
    public void checkMoney(){

        customerServiceimpl.checkBalance();
        customerServiceimpl.deposit(500);



    }


}
