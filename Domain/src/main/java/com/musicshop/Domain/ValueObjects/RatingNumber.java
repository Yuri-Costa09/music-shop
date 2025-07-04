package com.musicshop.Domain.ValueObjects;

import com.musicshop.Domain.Exceptions.DomainException;

public class RatingNumber {
    private int value;

    RatingNumber(int value) {
        if (value < 0 || value > 5) {
            throw new DomainException("Rating number out of range: MIN 0, MAX 5");
        }

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
