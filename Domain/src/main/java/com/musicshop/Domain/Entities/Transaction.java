package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
    private int id;
    private Order order;

    private String stripe_payment_intent_id;

    private PaymentStatus status = PaymentStatus.PENDING;

    private LocalDateTime paidAt;

    public Transaction(Order order,
                       String stripe_payment_intent_id) {
        this.order = order;
        this.stripe_payment_intent_id = stripe_payment_intent_id;
        this.paidAt = LocalDateTime.now();
    }

    protected Transaction() { }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getStripe_payment_intent_id() {
        return stripe_payment_intent_id;
    }

    public void setStripe_payment_intent_id(String stripe_payment_intent_id) {
        this.stripe_payment_intent_id = stripe_payment_intent_id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
