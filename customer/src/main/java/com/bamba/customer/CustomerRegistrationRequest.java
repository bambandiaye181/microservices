package com.bamba.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
