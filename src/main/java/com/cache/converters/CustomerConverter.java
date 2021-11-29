package com.cache.converters;

import com.cache.dto.CustomerDTO;
import com.cache.domain.Customer;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class CustomerConverter {

    public static Customer toModel(CustomerDTO customer) {
        return Customer.builder()
                       .id(customer.getId())
                       .name(customer.getName())
                .email(customer.getEmail())
                       .build();
    }

    public static CustomerDTO fromModel(Customer customer) {
        return CustomerDTO.builder()
                       .id(customer.getId())
                       .name(customer.getName())
                          .email(customer.getEmail())
                       .build();
    }

    public static List<CustomerDTO> fromListModel(List<Customer> customers){
        return customers.stream()
                 .map(CustomerConverter::fromModel)
                 .collect(Collectors.toList());
    }
}
