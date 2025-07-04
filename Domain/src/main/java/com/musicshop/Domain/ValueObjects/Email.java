package com.musicshop.Domain.ValueObjects;

import com.musicshop.Domain.Exceptions.DomainException;

public class Email {
    private final String value;

    Email(String value) {
        if (value == null) {
            throw new DomainException("Email value cannot be null");
        }

        if (!value.matches("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
            throw new DomainException("Email value is not valid");
        }

        this.value = value;
    }

    String getValue() {
        return value;
    }

}




