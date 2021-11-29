package com.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CachePoCApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachePoCApplication.class, args);
    }

}
