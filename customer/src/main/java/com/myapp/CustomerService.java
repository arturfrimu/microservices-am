package com.myapp;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerService(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        // todo: store customer in db
    }
}
