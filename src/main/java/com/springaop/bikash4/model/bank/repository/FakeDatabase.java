package com.springaop.bikash4.model.bank.repository;

import com.springaop.bikash4.model.bank.customer.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDatabase {
    private List<Customer> customers = new ArrayList();

    public Customer getCustomer(){
        Customer customer =new Customer();
        customer.setFirstname("Bikash");
        customer.setLastname("Shah");
        customer.setAccountNumber("123456789");
        customer.setBalance(10000);
        return customer;

    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }


}
