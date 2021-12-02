package com.cache.resource;

import com.cache.dto.CustomerDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public interface CustomerResource {

    @PostMapping("/customers")
    ResponseEntity createCustomer(@RequestBody CustomerDTO customer, UriComponentsBuilder builder);

    @GetMapping("/customers")
    ResponseEntity<List<CustomerDTO>> findAll();

    @GetMapping("/customers/{id}")
    ResponseEntity<CustomerDTO> findById(@PathVariable String id);

    @DeleteMapping("/customers/{id}")
    ResponseEntity<CustomerDTO> deleteById(@PathVariable String id);

    @PutMapping("/customers/{id}")
    ResponseEntity<CustomerDTO> replaceCustomer(@PathVariable String id, @RequestBody CustomerDTO customerDTO);
}
