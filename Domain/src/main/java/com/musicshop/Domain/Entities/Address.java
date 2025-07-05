package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.UF;

public class Address {
    private int id;
    private String neighborhood;
    private String street;
    private String city;
    private UF UF;

    public Address(String neighborhood,
                   String street,
                   String city,
                   UF UF) {
        this.neighborhood = neighborhood;
        this.street = street;
        this.city = city;
        this.UF = UF;
    }

    protected Address() { }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UF getUF() {
        return UF;
    }

    public void setUF(UF UF) {
        this.UF = UF;
    }
}
