package com.anuja.rentcloud.profileservice.controller;

import com.anuja.rentcloud.commons.model.Customer;
import com.anuja.rentcloud.profileservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/services")
public class ProfileController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save (@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    @GetMapping
    public Customer get(){
        return new Customer(9,"aw","ko","ko98","ko99");
    }
}
