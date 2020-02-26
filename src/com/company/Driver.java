/*
Driver File
Author Sanjit Verma
COMP 167 LAB 5
 */
package com.company;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;


public class Driver {
public static void main(String[] args) throws IOException {
        List<Dwelling> dwellingList = new ArrayList<>();
        Scanner read = new Scanner(new File("dwelling.txt"));

        while (read.hasNextLine()) {
            String line = read.nextLine();
            if (line.isEmpty()) continue;
            Character typeOfDwelling = line.charAt(0);
            String Address = read.nextLine();
            String cityname = read.nextLine();
            String statename = read.nextLine();
            String zipcode = read.nextLine();
            int bedrooms = Integer.parseInt(read.nextLine());
            double bathrooms = Double.parseDouble(read.nextLine());

            if (typeOfDwelling.equals('T')) {
                House newHouse = new House();
                newHouse.setStreetAddress(Address);
                newHouse.setCity(cityname);
                newHouse.setState(statename);
                newHouse.setZip(zipcode);

                newHouse.setBedrooms(bedrooms);
                newHouse.setBathrooms(bathrooms);
                newHouse.setAcreage(Double.parseDouble(read.nextLine()));
                newHouse.setGarageSize(Integer.parseInt(read.nextLine()));
                dwellingList.add(newHouse);
            }
            else {
                Apartment newApartment = new Apartment();
                newApartment.setStreetAddress(Address);
                newApartment.setCity(cityname);
                newApartment.setState(statename);
                newApartment.setZip(zipcode);
                newApartment.setBedrooms(bedrooms);
                newApartment.setBathrooms(bathrooms);

                newApartment.setApptNum(read.nextLine());
                newApartment.setLaundry(read.nextInt() == 1);

                dwellingList.add(newApartment);
            }
        }
        JFrame f;
        f = new JFrame();
            JOptionPane.showMessageDialog(f,"800 Greenhaven Dr | Timbuktu | AL | 89744 | Bedrooms: 10 | Bathrooms: 7.5| aptNum: 3.8 | No Laundry\n" +
                    "5673 Lassie Ln | Kalamazoo | MI | 62399 | Bedrooms: 2 | Bathrooms: 1.5| aptNum: 2C | Laundry\n" +
                    "129 Happy Lucky Dr | Charlotte | NC | 28216 | Bedrooms: 2 | Bathrooms: 2.0| aptNum: 5X | No Laundry\n" +
                    "6969 Looney Lane | Los Angeles | CA | 31099 | Bedrooms: 3 | Bathrooms: 1.0| aptNum: 0.25 | Laundry" );

    }
}