package com.cache.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document("Customers")
public class Customer {

    @Id
    private String id;

    private String name;

    private String email;

}
