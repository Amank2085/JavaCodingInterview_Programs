package com.core.javacodes;

// Outer class: Car
class Car {
    // Instance variables (Each object has its own copy, stored in heap memory)
    private String brand;
    private String model;
    private int year;
    private double price;

    // Static variable (Shared among all objects, stored in method area)
    private static int totalCars = 0;

    // Constructor (Local variables: `brand`, `model`, `year`, `price` stored in stack memory)
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        totalCars++; // Increment static variable (stored in method area)
    }

    // Instance Method: Displays car details
    public void displayCarInfo() {
        // Local variables: `message`, `taxRate`, `finalPrice` (Stored in stack memory)
        String message = "Car Details:";
        double taxRate = 0.10; // 10% tax rate
        double finalPrice = price + (price * taxRate); // Price after tax

        System.out.println(message);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price (after tax): $" + finalPrice);
    }

    // Static Method: Returns the total number of cars created
    public static int getTotalCars() {
        return totalCars;
    }

    // ============================ //
    // Static Nested Class: Engine  //
    // ============================ //
    static class Engine {
        private int horsepower;
        private String type;

        // Constructor (Local variables: `horsepower`, `type` stored in stack memory)
        public Engine(int horsepower, String type) {
            this.horsepower = horsepower;
            this.type = type;
        }

        // Method to display engine details
        public void displayEngineInfo() {
            System.out.println("Engine Horsepower: " + horsepower);
            System.out.println("Engine Type: " + type);
        }
    }

    // ============================== //
    // Non-Static Inner Class: Battery //
    // ============================== //
    class Battery {
        private int capacity; // Capacity in kWh

        // Constructor (Local variable: `capacity` stored in stack memory)
        public Battery(int capacity) {
            this.capacity = capacity;
        }

        // Method to display battery details
        public void displayBatteryInfo() {
            System.out.println("Battery Capacity: " + capacity + " kWh");
            System.out.println("This battery belongs to: " + brand + " " + model);
        }
    }

    // Method with a Local Inner Class
    public void showCarWarranty() {
        // Local variable (Stored in stack memory)
        int warrantyYears = 5;

        // Local Inner Class (Stored in stack memory until the method executes)
        class Warranty {
            public void displayWarrantyInfo() {
                System.out.println("Warranty Period: " + warrantyYears + " years.");
            }
        }

        // Creating an object of the local inner class
        Warranty warranty = new Warranty();
        warranty.displayWarrantyInfo();
    }
}