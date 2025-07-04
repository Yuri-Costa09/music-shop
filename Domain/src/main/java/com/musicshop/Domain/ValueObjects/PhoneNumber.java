package com.musicshop.Domain.ValueObjects;

import com.musicshop.Domain.Exceptions.DomainException;

public class PhoneNumber {
    private String value;

    PhoneNumber(String value) {
        if (value == null) {
            throw new DomainException("amount cannot be null");
        }

        if (!value.matches("^\\+[1-9]\\d{1,14}$")) {
            throw new DomainException("Should be in format: E.164, ex: +5511998765432");
        }

        this.value = value;
    }

    String getValue() {
        return value;
    }
}
