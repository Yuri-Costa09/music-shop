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

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<InstrumentListing> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<InstrumentListing> instruments) {
        this.instruments = instruments;
    }
}
