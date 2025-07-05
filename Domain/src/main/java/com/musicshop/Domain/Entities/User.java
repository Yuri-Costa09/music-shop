package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.Role;
import com.musicshop.Domain.ValueObjects.Email;
import com.musicshop.Domain.ValueObjects.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String lastName;
    private Email email;
    private PhoneNumber phoneNumber;
    private String passwordHash;
    private String profile_photo_url;
    private Address address;
    private Role role;

    private List<InstrumentListing> instrumentListings = new ArrayList<>();
    private List<Rating> ratings = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public User(String name,
                String lastName,
                Email email,
                PhoneNumber phoneNumber,
                String passwordHash,
                String profile_photo_url,
                Address address,
                Role role) {

        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.passwordHash = passwordHash;
        this.profile_photo_url = profile_photo_url;
        this.address = address;
        this.role = role;
    }

    protected User() { }
}
