package com.musicshop.Domain.Entities;

import com.musicshop.Domain.ValueObjects.Money;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InstrumentListing {
    private int id;
    private String title;
    private String description;
    private Money price;
    private LocalDateTime createdAt;
    private boolean sold;

    private List<String> instrumentPhotosUrl = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();

    private User owner;

    public InstrumentListing(LocalDateTime createdAt,
                             User owner,
                             Money price,
                             String description,
                             String title,
                             boolean sold) {

        this.createdAt = LocalDateTime.now();
        this.owner = owner;
        this.price = price;
        this.description = description;
        this.title = title;
        this.sold = false;
    }

    protected InstrumentListing() { }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public List<String> getInstrumentPhotosUrl() {
        return instrumentPhotosUrl;
    }

    public void setInstrumentPhotosUrl(List<String> instrumentPhotosUrl) {
        this.instrumentPhotosUrl = instrumentPhotosUrl;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
