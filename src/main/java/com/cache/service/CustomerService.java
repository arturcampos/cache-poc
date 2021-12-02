package com.cache.service;

import com.cache.domain.Customer;

import java.util.List;

public interface CustomerService {


    Customer create(Customer customer);

    List<Customer> findAll();

    Customer findById(String id);

    Customer deleteById(String id);


    Customer replace(String id, Customer customer);
}
