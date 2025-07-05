package com.musicshop.Domain.Entities;

import com.musicshop.Domain.ValueObjects.Money;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstrumentListing {
    private int id;
    private String title;
    private String description;
    private Money price;
    private LocalDateTime createDate;

    private List<String> instrumentPhotosUrl = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();

    private User owner;

    public InstrumentListing(LocalDateTime createDate,
                             User owner,
                             Money price,
                             String description,
                             String title) {

        this.createDate = LocalDateTime.now();
        this.owner = owner;
        this.price = price;
        this.description = description;
        this.title = title;
    }

    protected InstrumentListing() { }
}
