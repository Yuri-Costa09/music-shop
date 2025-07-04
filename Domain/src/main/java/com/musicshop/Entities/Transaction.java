package com.musicshop.Entities;

import com.musicshop.Enums.PaymentStatus;

import java.util.Date;

public class Transaction {
    private Integer id;
    private Order order;

    private String stripe_payment_intent_id;

    private PaymentStatus status;

    private Date paidAt;
}
