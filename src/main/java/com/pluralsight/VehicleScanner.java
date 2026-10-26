package com.pluralsight;
import java.util.Scanner;
public class VehicleScanner {
    public static void main(String[] args) {
        int vehicles=0;
        while (vehicles<=5){
            System.out.println(vehicles);
            vehicles = vehicles +1;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model");
        System.out.println(" 3 - Search by price range");
        System.out.println(" 4 - Search by color");
        System.out.println(" 5 - Add a vehicle");
        System.out.println(" 6 - Quit");
        System.out.println("Enter your command: ");

        String Vehicle = scanner.nextLine();

        int command = scanner.nextInt();
        switch(command) {
            case 1:
                listAllVehicles(Vehicle);
                break;
            case 2:
                findVehiclesByMakeModel();
                break;
//...
        }

    }
}
