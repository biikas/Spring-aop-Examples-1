package com.springaop.bikash4.model.bank.customerService;

import com.springaop.bikash4.model.bank.customer.Customer;
import com.springaop.bikash4.model.bank.repository.FakeDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    private FakeDatabase customerRepo;

    public void save(){
        Customer customer = new Customer();
        customer.setFirstname("Bishal");
        customer.setLastname("Shah");
        customer.setAccountNumber("987654321");
        customer.setBalance(50000);
        customerRepo.addCustomer(customer);
    }
    public void read() {
        Customer returnedCustomer = customerRepo.getCustomer();
//        System.out.println(returnedCustomer.getAccountNumber());
//        System.out.println(returnedCustomer.getBalance());
        returnedCustomer.getAccountNumber();
        returnedCustomer.getBalance();

    }

}
