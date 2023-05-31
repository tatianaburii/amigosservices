package com.amogoscode.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}
