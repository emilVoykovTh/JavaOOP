package polymorphism.exercises.problem1and2Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        String[] busInfo = scanner.nextLine().split("\\s+");


        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandTokens = scanner.nextLine().split("\\s+");
            String command = commandTokens[0];
            String vehicle = commandTokens[1];
            try {
                switch (command) {
                    case "Drive":
                        if (vehicle.equals("polymorphism.exercises.problem1and2Vehicles.Car")) {
                            System.out.println(car.drive(Double.parseDouble(commandTokens[2])));
                        } else if (vehicle.equals("polymorphism.exercises.problem1and2Vehicles.Truck")) {
                            System.out.println(truck.drive(Double.parseDouble(commandTokens[2])));
                        } else {
                            System.out.println(bus.drive(Double.parseDouble(commandTokens[2])));
                        }
                        break;

                    case "Refuel":
                        if (vehicle.equals("polymorphism.exercises.problem1and2Vehicles.Car")) {
                            car.refuel(Double.parseDouble(commandTokens[2]));
                        } else if (vehicle.equals("polymorphism.exercises.problem1and2Vehicles.Truck")) {
                            truck.refuel(Double.parseDouble(commandTokens[2]));
                        } else {
                            bus.refuel(Double.parseDouble(commandTokens[2]));
                        }
                        break;
                    case "DriveEmpty":
                        System.out.println(bus.driveEmpty(Double.parseDouble(commandTokens[2])));
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());

    }
}
