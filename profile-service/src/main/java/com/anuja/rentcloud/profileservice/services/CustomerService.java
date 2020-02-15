package com.anuja.rentcloud.profileservice.services;

import com.anuja.rentcloud.commons.model.Customer;
import com.anuja.rentcloud.commons.model.exception.CustomizedExceptions;

public interface CustomerService {

    Customer save(Customer customer) throws CustomizedExceptions;
    Customer getCustomer(String DiNumber) throws CustomizedExceptions;
}
