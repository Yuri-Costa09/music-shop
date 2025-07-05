package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.OrderStatus;
import com.musicshop.Domain.ValueObjects.Money;

import java.time.LocalDateTime;
import java.util.Currency;

public class Order {
    private int id;
    private OrderStatus status = OrderStatus.PENDING;
    private Money amount;
    private Currency currency;

    private User buyer;
    private Transaction transaction;
    private LocalDateTime created_at;

    public Order(Money amount,
                 Currency currency,
                 User buyer,
                 Transaction transaction) {

        this.amount = amount;
        this.currency = currency;
        this.buyer = buyer;
        this.transaction = transaction;
        this.created_at = LocalDateTime.now();
    }

    protected Order() { }
}
