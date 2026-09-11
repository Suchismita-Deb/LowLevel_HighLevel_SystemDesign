package org.example.LowLevelDesignSystemExample.RideSharingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        RideSharingAppService rideSharingAppService = new RideSharingAppService();
        Driver driver1 = new Driver("Driver1", 1, 20, 0, true, new Vehicle("Car", "KA-01-1234"));
        Driver driver2 = new Driver("Driver2", 2, 2, 2, true, new Vehicle("Bike", "KA-02-5678"));

        rideSharingAppService.addDriver(driver1);
        rideSharingAppService.addDriver(driver2);

        Passenger passenger1 = new Passenger("Passenger1", 1, 1, 5, 5);

        Driver captain = rideSharingAppService.bookRide(passenger1, passenger1.distance);
        if (captain != null) {
            double fare = rideSharingAppService.calcFare(passenger1, passenger1.distance, captain);
            System.out.println("Assigned driver - " + captain.name);
            System.out.println("Fare: " + fare);
        }
    }
}

class RideSharingAppService {
    private List<Driver> driverList = new ArrayList<>();
    private List<Passenger> passengerList = new ArrayList<>();

    public void addDriver(Driver driver) {
        driverList.add(driver);
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    public Driver bookRide(Passenger passenger, double distance) {
        if (driverList.isEmpty()) {
            System.out.println("No driver available");
            return null;
        }

        Driver assignedDriver = null;

        // PriorityQueue ordered by distance
        PriorityQueue<Pair1<Double, Driver>> pq =
                new PriorityQueue<>(Comparator.comparingDouble(p -> p.first));

        for (Driver driver : driverList) {
            int posX = driver.driverX;
            int posY = driver.driverY;
            int passengerX = passenger.passengerX;
            int passengerY = passenger.passengerY;

            double dist = Math.sqrt(
                    (passengerX - posX) * (passengerX - posX) +
                            (passengerY - posY) * (passengerY - posY)
            );

            pq.add(new Pair1<>(dist, driver));
        }

        while (!pq.isEmpty()) {
            Pair1<Double, Driver> pair = pq.poll();
            Driver driver = pair.second;

            if (driver.accept) {
                assignedDriver = driver;
                break;
            }
        }

        if (assignedDriver == null) {
            System.out.println("Huge traffic, could not find a driver nearby. Updating in next 5 mins.");
        }

        return assignedDriver;
    }

    public double calcFare(Passenger passenger, double distance, Driver driver) {
        double val;
        Vehicle vehicle = driver.type;
        double dist = passenger.distance;

        if (vehicle.name.equals("Car")) {
            val = dist * 20;
        } else if (vehicle.name.equals("Bike")) {
            val = dist * 12;
        } else {
            val = dist * 5;
        }

        return val;
    }
}

class Driver {
    public String name;
    public int id;
    public int driverX, driverY;
    public boolean accept;
    public Vehicle type;

    public Driver(String name, int id, int driverX, int driverY, boolean accept, Vehicle type) {
        this.name = name;
        this.id = id;
        this.driverX = driverX;
        this.driverY = driverY;
        this.accept = accept;
        this.type = type;
    }
}

class Passenger {
    public String name;
    public int passengerX, passengerY;
    public int destinationX, destinationY;
    public double distance;

    public Passenger(String name, int passengerX, int passengerY, int destinationX, int destinationY) {
        this.name = name;
        this.passengerX = passengerX;
        this.passengerY = passengerY;
        this.destinationX = destinationX;
        this.destinationY = destinationY;
        this.distance = Math.sqrt(
                (destinationX - passengerX) * (destinationX - passengerX) +
                        (destinationY - passengerY) * (destinationY - passengerY)
        );
    }
}

class Pair1<F, S> {
    F first;
    S second;

    public Pair1(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

class Vehicle {
    public String name;
    public String numberPlate;

    public Vehicle(String name, String numberPlate) {
        this.name = name;
        this.numberPlate = numberPlate;
    }
}
