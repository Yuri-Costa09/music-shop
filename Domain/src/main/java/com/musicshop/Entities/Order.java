package com.musicshop.Entities;

import com.musicshop.Enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private OrderStatus status;
    private Money amount;
    private String currency;

    private User buyerId;
    private Transaction transaction;
    private Date created_at;
}
