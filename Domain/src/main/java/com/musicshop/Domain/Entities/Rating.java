package com.musicshop.Domain.Entities;

import com.musicshop.Domain.ValueObjects.RatingNumber;

public class Rating {
    private int id;
    private RatingNumber ratingNumber; // vai de 0 a 5
    private String content;

    private User user;
    private User targetUser;

    public Rating(RatingNumber ratingNumber,
                  String content,
                  User user,
                  User targetUser) {

        this.ratingNumber = ratingNumber;
        this.content = content;
        this.user = user;
        this.targetUser = targetUser;
    }

    protected Rating() { }

    public RatingNumber getRatingNumber() {
        return ratingNumber;
    }

    public void setRatingNumber(RatingNumber ratingNumber) {
        this.ratingNumber = ratingNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(User targetUser) {
        this.targetUser = targetUser;
    }
}
