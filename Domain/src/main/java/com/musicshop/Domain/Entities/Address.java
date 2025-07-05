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
}
