package com.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.customer.mapper.**")
public class CustomerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerSystemApplication.class, args);
    }

}
