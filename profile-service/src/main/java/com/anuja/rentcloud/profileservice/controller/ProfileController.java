package com.anuja.rentcloud.profileservice.controller;

import com.anuja.rentcloud.commons.model.Customer;
import com.anuja.rentcloud.commons.model.exception.CustomizedExceptions;
import com.anuja.rentcloud.profileservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/customer")
public class ProfileController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> save (@RequestBody Customer customer) {
        Customer savedCustomer = null;
        try {
            savedCustomer = customerService.save(customer);
            return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
        } catch (CustomizedExceptions customizedExceptions) {
            customizedExceptions.printStackTrace();
            return new ResponseEntity<>(customer, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") String DiNumber){
        Customer retrivedCustomer = null;
        try {
            retrivedCustomer = customerService.getCustomer(DiNumber);
            return new ResponseEntity(retrivedCustomer, HttpStatus.OK);
        } catch (CustomizedExceptions customizedExceptions) {
            customizedExceptions.printStackTrace();
            return new ResponseEntity("Customer not exists", HttpStatus.BAD_REQUEST);
        }
    }
}
