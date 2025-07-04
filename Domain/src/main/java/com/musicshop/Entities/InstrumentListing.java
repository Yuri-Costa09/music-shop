package com.musicshop.Entities;

import java.util.Date;
import java.util.List;

public class InstrumentListing {
    private Integer id;
    private String title;
    private String description;
    private Money price; // Value Object
    private List<String> instrumentPhotosUrl;
    private List<Tag> tags;
    private Date createDate;

    private User owner;
}
