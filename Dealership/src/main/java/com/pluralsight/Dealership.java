package com.pluralsight;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }
    public ArrayList<Vehicle> getVehiclePrice(double min, double max){
        ArrayList<Vehicle> matches = new ArrayList<Vehicle>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                matches.add(vehicle);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehiclesByMake(String make, String model){
        return null;
    }
    public ArrayList<Vehicle> getVehicleByYear(int min, int max){
        return null;
    }
    public ArrayList<Vehicle> getVehicleByColor(String color){
        return null;
    }
    public ArrayList<Vehicle> getVehicleMileage(int min, int max){
        return null;
    }
    public ArrayList<Vehicle> getVehicleByType(String type){
        return null;
    }
    public void removeVehicle(Vehicle vehicle){

    }
    public void addVehicle(){

    }}
