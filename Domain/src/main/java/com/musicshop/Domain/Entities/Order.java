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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

}
