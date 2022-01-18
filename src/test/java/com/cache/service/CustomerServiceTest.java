package com.cache.service;

import com.cache.AppConfigTest;
import com.cache.domain.Customer;
import com.cache.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@DisplayName("customerServiceTest")
public class CustomerServiceTest extends AppConfigTest {

    @MockBean
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @Test
    @DisplayName("Should add customer")
    void shouldAddCustomer() {

        //mocking domain
        Customer customer = mock(Customer.class);
        when(customer.getId()).thenReturn(UUID.randomUUID().toString());
        when(customer.getName()).thenReturn("Customer name 1");
        when(customer.getEmail()).thenReturn("customer@email.com");

        //mocking repository
        when(customerRepository.save(any(Customer.class))).thenReturn(customer);

        //executing
        Customer savedCustomer = customerService.create(customer);

        //verifying execution
        Assertions.assertNotNull(savedCustomer);
        verify(customerRepository, times(1)).save(ArgumentMatchers.any(Customer.class));
    }

}
