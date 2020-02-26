/*
Dwelling File
Author Sanjit Verma
COMP 167 LAB 5
 */
package com.company;
public class Dwelling {
    String address;
    String cityname;
    String statename;
    String zipcode;
    int bedroomsamount;
    double bathroomnumber;
public void setStreetAddress(String streetAddress) {
        this.address = streetAddress;
    }
public String getStreetAddress() {
        return address;
    }
public void setCity(String city) {
        this.cityname = city;
    }
public String getCity() {
        return cityname;
    }
public void setState(String state) {
        this.statename = state;
    }
public String getState() {
        return statename;
    }
public void setZip(String zip) {
        this.zipcode = zip;
    }
public String getZip() {
        return zipcode;
    }
public void setBedrooms(int bedrooms) {
        this.bedroomsamount = bedrooms;
    }
public int getBedrooms() {
        return bedroomsamount;
    }
public void setBathrooms(double bathrooms) {
        this.bathroomnumber = bathrooms;
    }
public double getBathrooms() {
        return bathroomnumber;
    }
public String toString() {
        return address + " | " + cityname + " | " + statename + " | " + zipcode + " | Bedrooms: " + bedroomsamount + " | Bathrooms: " + bathroomnumber;
    }
public Dwelling() {}

}
