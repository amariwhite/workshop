package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public void display(){
        init();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.println("Enter selection: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    processAllVehicleRequest();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Invalid selection. Try again. ");

            }
        }while (choice != 10);
        }
        private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();

    }
    private void displayMenu(){
        System.out.println("\n=== Dealership Menu ===");
        System.out.println("1) Find vehicles within a price range");
        System.out.println("2) Find vehicles by make/model");
        System.out.println("3) Find vehicles by year range");
        System.out.println("4) Find vehicles by color");
        System.out.println("5) Find vehicles by mileage range");
        System.out.println("6) Find vehicles by type");
        System.out.println("7) List all vehicles");
        System.out.println("8) Add a vehicle");
        System.out.println("9) Remove a vehicle");
        System.out.println("10 Quit");
    }
    private void processAllVehicleRequest(){
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }
    private void displayVehicles(List<Vehicle> vehicles){
        if (vehicles == null || vehicles.isEmpty()){
            System.out.println("No vehicles found. ");
            return;

        }
        System.out.println("\nVehicle List");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
    private void processGetByPriceRequest(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum price: ");
        double min = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double max = scanner.nextDouble();

        ArrayList<Vehicle> vehicles = dealership.getVehiclePrice(min, max);
        displayVehicles(vehicles);

    }
    private void processGetByMakeModelRequest(){

    }
    private void processGetByYearRequest(){

    }
    private void processGetByColorRequest(){

    }
    private void processGetByMileageRequest(){

    }
    private void processGetByVehicleType(){

    }
    private void processAddVehicleRequest(){

    }
    private void processRemoveVehicleRequest(){

    }
}
