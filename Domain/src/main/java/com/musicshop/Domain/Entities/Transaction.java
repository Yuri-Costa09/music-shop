package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
    private int id;
    private Order order;

    private String stripe_payment_intent_id;

    private PaymentStatus status;

    private LocalDateTime paidAt;
}
