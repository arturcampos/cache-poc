package com.cache.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class CustomerDTO {

    private String id;

    private String name;

    private String email;
}
