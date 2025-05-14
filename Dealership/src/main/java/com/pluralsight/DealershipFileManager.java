package com.pluralsight;

import org.w3c.dom.DOMImplementation;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public Dealership getDealership(){
        Dealership dealership = new Dealership("Dave", "401 Graham Street", "704-555-5555");

        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            if (line != null){
                String[] dealershipInfo = line.split("\\|");
                dealership = new Dealership(dealershipInfo[0], dealershipInfo[1], dealershipInfo[2]);

            }
            String vehicleLine;
            while ((vehicleLine = reader.readLine())!=null){
                String[] parts = vehicleLine.split("\\|");
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String type = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);
                dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odometer, price));
            }
            reader.close();


        } catch (Exception e) {
            System.out.println("An error occurred reading the file. ");
            e.printStackTrace();
        }
        return dealership;
    }
    public void saveDealership(Dealership dealership){
    }
}
