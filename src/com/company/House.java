/*
House File
Author Sanjit Verma
COMP 167 LAB 5
 */
package com.company;
public class House extends Dwelling {
    protected double acre;
    protected int garage;
public void setAcreage(double acreage) {
        this.acre = acreage;
    }
public double getAcreage() {
        return acre;
    }
public void setGarageSize(int garageSize) {
        this.garage = garageSize;
    }
public int getGarageSize() {
        return garage;
    }
public String toString() {
        return super.toString() + " | acreage: " + acre + " | garage size:" + garage;
    }
public House() {}
}