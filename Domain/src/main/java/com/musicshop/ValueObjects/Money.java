package com.musicshop.ValueObjects;

import java.math.BigDecimal;

public class Money {

    private BigDecimal value;

    Money(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("amount cannot be null");
        }
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("amount cannot be negative or zero");
        }

        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
