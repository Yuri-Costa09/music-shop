package com.musicshop.Entities;

import com.musicshop.Enums.OrderStatus;
import com.musicshop.ValueObjects.Money;

import java.util.Currency;
import java.util.Date;

public class Order {
    private Integer id;
    private OrderStatus status;
    private Money amount;
    private Currency currency;

    private User buyerId;
    private Transaction transaction;
    private Date created_at;
}
