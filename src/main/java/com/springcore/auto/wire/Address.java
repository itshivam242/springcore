package com.springcore.auto.wire;

public class Address {
    private String street;
    private String city;
    private String country;

    public Address()
    {
        System.out.println( "Inside Address no parameter constructor" );
    }
    public Address(String street, String city, String country) {
        System.out.println( "Inside Address parameterized constructor" );
        this.street = street;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return street + ", "+ city +", "+ country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
