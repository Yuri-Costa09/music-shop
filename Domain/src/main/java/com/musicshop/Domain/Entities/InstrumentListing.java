package com.musicshop.Domain.Entities;

import com.musicshop.Domain.ValueObjects.Money;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class InstrumentListing {
    private int id;
    private String title;
    private String description;
    private Money price;
    private List<String> instrumentPhotosUrl;
    private List<Tag> tags;
    private LocalDateTime createDate;

    private User owner;


}
