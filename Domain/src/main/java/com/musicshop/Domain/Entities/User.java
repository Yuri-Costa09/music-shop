package com.musicshop.Domain.Entities;

import com.musicshop.Domain.Enums.Role;
import com.musicshop.Domain.ValueObjects.Email;
import com.musicshop.Domain.ValueObjects.PhoneNumber;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String lastName;
    private Email email; // criar um VO
    private PhoneNumber phoneNumber; // criar um VO
    private String passwordHash;
    private String profile_photo_url;
    private Address address;
    private Role role;

    private List<InstrumentListing> InstrumentListings;
    private List<Rating> ratings;
}
