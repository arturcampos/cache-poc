package com.cache.test.service;

import com.cache.test.domain.Customer;
import com.cache.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @CacheEvict(cacheNames = "customers", allEntries = true)
    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }

    @Cacheable(cacheNames = "customers", key = "#root.method")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Cacheable(cacheNames = "customers", key = "#id")
    public Customer findById(String id){
        return customerRepository.findById(id).orElseThrow();
    }


}
