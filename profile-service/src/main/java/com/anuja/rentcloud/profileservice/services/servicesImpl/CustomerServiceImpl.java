package com.anuja.rentcloud.profileservice.services.servicesImpl;

import com.anuja.rentcloud.commons.model.Customer;
import com.anuja.rentcloud.commons.model.exception.CustomizedExceptions;
import com.anuja.rentcloud.profileservice.repository.CustomerRepository;
import com.anuja.rentcloud.profileservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) throws CustomizedExceptions {
        Customer existsOne = customerRepository.getCustomerByDlNumber(customer.getDlNumber());
        if (existsOne != null) {
            throw new CustomizedExceptions("DI number already exists");
        }
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(String DiNumber) throws CustomizedExceptions {
        Customer existsOne = customerRepository.getCustomerByDlNumber(DiNumber);
        if (existsOne == null) {
            throw new CustomizedExceptions("No customer exists");
        }
        return existsOne;
    }
}
