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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getProfile_photo_url() {
        return profile_photo_url;
    }

    public void setProfile_photo_url(String profile_photo_url) {
        this.profile_photo_url = profile_photo_url;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<InstrumentListing> getInstrumentListings() {
        return instrumentListings;
    }

    public void setInstrumentListings(List<InstrumentListing> instrumentListings) {
        this.instrumentListings = instrumentListings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
