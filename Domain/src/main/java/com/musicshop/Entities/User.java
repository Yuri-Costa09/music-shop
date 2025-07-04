package com.musicshop.Entities;

import com.musicshop.Enums.Role;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String email; // criar um VO
    private String phoneNumber; // criar um VO
    private String passwordHash;
    private String profile_photo_url;
    private Address address;
    private Role role;

    private List<InstrumentListing> InstrumentListings;
    private List<Rating> ratings;
}
