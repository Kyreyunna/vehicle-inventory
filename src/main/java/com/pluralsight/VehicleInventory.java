package com.pluralsight;

public class VehicleInventory {
    public static void main(String[] args) {
        //access set method
        //creating new instance of a vehicle object
        // data type, variable name, assignment of the variable
        //object is type of data type that can hold multiple variables
        Vehicle vehicle1 = new Vehicle(1, "Ford Explorer", "red", 0, 0.0);
        //^Replaces writing each value and variable
        //line by line

            //print statement to print out vehicle information
            System.out.println(vehicle1.toString());
            //toString: it returns the variables

            //create an array capable of holding up to 20 vehicles and a counter
            //variable that tells you how many vehicles are in the array right now.
            //Preload the array with 6 vehicles:
            //data type is an array (list) of vehicles, variable name that is an instance of an array
            // new array
            Vehicle[] vehicles = new Vehicle[20];
            //in the array list this vehicle first
            // Preload the array with 6 vehicles
            vehicles[0] = new Vehicle(1, "Ford Explorer", "red", 0, 0.0);
            vehicles[1] = new Vehicle(1012, "Toyota Camry", "blue", 20000, 22000.0);
            vehicles[2] = new Vehicle(1013, "Honda Civic", "silver", 15000, 20000.0);
            vehicles[3] = new Vehicle(1014, "Chevrolet Tahoe", "black", 60000, 35000.0);
            vehicles[4] = new Vehicle(1015, "Nissan Altima", "white", 30000, 18000.0);
            vehicles[5] = new Vehicle(1016, "Subaru Outback", "green", 12000, 28000.0);

            for (Vehicle vehicle : vehicles) {
                //calls the toString done earlier
                System.out.println(vehicle);
            }

        }
    }

