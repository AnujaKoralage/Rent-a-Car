package com.anuja.rentcloud.profileservice.repository;

import com.anuja.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer getCustomerByDlNumber(String DiNumber);
}
