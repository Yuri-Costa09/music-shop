package com.musicshop.Domain.Entities;

import com.musicshop.Domain.ValueObjects.RatingNumber;

public class Rating {
    private int id;
    private RatingNumber ratingNumber; // vai de 0 a 5
    private String content;

    private User user;
    private User targetUser;
}
