package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.OrderStatus;
import com.musicshop.Domain.ValueObjects.Money;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Date;

public class Order {
    private int id;
    private OrderStatus status;
    private Money amount;
    private Currency currency;

    private User buyerId;
    private Transaction transaction;
    private LocalDateTime created_at;
}
