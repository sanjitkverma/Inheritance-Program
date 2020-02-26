/*
Apartment File
Author Sanjit Verma
COMP 167 LAB 5
 */
package com.company;
public class Apartment extends Dwelling {
     String apptNum;
     boolean laundry;

public void setApptNum(String apptNum) {
        this.apptNum = apptNum;
    }
public String getApptNum() {
        return apptNum;
    }
public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }
public boolean isLaundry() {
        return laundry;
    }
public String toString() {
        return super.toString() + "| aptNum: " + apptNum + " | " + (laundry ? "Laundry" : "No Laundry");
    }
public Apartment() {}
}
