package com.anuja.rentcloud.profileservice.services.servicesImpl;

import com.anuja.rentcloud.commons.model.Customer;
import com.anuja.rentcloud.profileservice.repository.CustomerRepository;
import com.anuja.rentcloud.profileservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
