package com.musicshop.Domain.Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tag {
    private int id;
    private String tagName;

    private List<InstrumentListing> instruments = new ArrayList<>();

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    protected Tag() { }
}
