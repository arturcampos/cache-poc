package com.cache.service.impl;

import com.cache.domain.Customer;
import com.cache.exception.NotFoundException;
import com.cache.repository.CustomerRepository;
import com.cache.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @CacheEvict(cacheNames = "customers", allEntries = true)
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Cacheable(cacheNames = "customers", key = "#root.method")
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }

    @Cacheable(cacheNames = "customers", key = "#id")
    public Customer findById(String id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }

        throw new NotFoundException();
    }

    @CacheEvict(cacheNames = "customers", allEntries = false, key = "#id")
    public Customer deleteById(String id) {
        Customer customer = null;
        try {
            customer = findById(id);
            delete(customer);
        } catch (Exception ex) {
            log.error("deleteById - erro");
        }
        return customer;
    }


    private void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @CachePut(cacheNames = "customers", key = "#id")
    public Customer replace(String id, Customer customer) {
        customer.setId(id);
        return customerRepository.save(customer);
    }
}
