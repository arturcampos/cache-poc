package com.cache.resource;

import com.cache.dto.CustomerDTO;
import com.cache.converters.CustomerConverter;
import com.cache.domain.Customer;
import com.cache.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerService service;

    @PostMapping("/customers")
    public ResponseEntity createCustomer(@RequestBody CustomerDTO customer, UriComponentsBuilder builder) {
        Customer newCustomer = service.create(CustomerConverter.toModel(customer));

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/customers/{id}").buildAndExpand(newCustomer.getId()).toUri());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerDTO>> findAll() {
        return ResponseEntity.ok(CustomerConverter.fromListModel(service.findAll()));
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerDTO> findById(@PathVariable String id) {
        return ResponseEntity.ok(CustomerConverter.fromModel(service.findById(id)));
    }
}
