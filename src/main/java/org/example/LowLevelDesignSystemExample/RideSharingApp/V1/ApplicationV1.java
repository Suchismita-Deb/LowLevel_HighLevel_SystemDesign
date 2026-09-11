package org.example.LowLevelDesignSystemExample.RideSharingApp.V1;

import java.util.ArrayList;
import java.util.List;

public class ApplicationV1 {
    public static void main(String[] args) {
        Location loc1 = new Location(12.9716, 77.5946);
        Location loc2 = new Location(12.9716, 77.5946);
        Location loc3 = new Location(12.9716, 77.5946);

        Vehicle car = new Car("KA-01-1234");
        Vehicle bike = new Bike("KA-01-1234");

        Driver driver1 = new Driver("Driver1", "abc@gmail.com", loc1, car);
        Driver driver2 = new Driver("Driver2","abc1@gmail.com", loc2, bike);


        RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();
        rideMatchingSystem.addDriver(driver1);
        rideMatchingSystem.addDriver(driver2);


        Passenger passenger = new Passenger("Passenger1", "abcabc@gmail.com",loc1);
        // Write the driver.
        rideMatchingSystem.requestRide(passenger,10,new SharedFareStrategy());
    }
}
class RideMatchingSystem {
    private List<Driver> avaiableDriverList = new ArrayList<>();
    public void addDriver(Driver driver) {
        avaiableDriverList.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {
        if(avaiableDriverList.isEmpty()) {
            passenger.notify("No Driver Available");
            return;
        }
        // The notification of the Passenger in the class.
        Driver nearestDriver = findNearestDriver(passenger.location);
        avaiableDriverList.remove(nearestDriver);
        // The status will be updated when the ride is done.
        Ride ride = new Ride(passenger, nearestDriver, distance, fareStrategy);
        ride.calculatedFare();
        passenger.notify("Ride scheduled with fare - "+ride.getFare());
        nearestDriver.notify("Ride scheduled with fare - "+ride.getFare());
        ride.updateStatus(RideStatus.ONGOING);
        ride.updateStatus(RideStatus.COMPLETED);
        avaiableDriverList.add(nearestDriver);
    }
    public Driver findNearestDriver(Location location) {
        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;
        for (Driver driver : avaiableDriverList) {
            double dist = driver.location.calcDistance(location);
            if(dist<minDistance) {
                nearestDriver = driver;
                minDistance = dist;
            }
        }
        return nearestDriver;
    }
}
class Location {
    public double latitude;
    public double longitude;
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double calcDistance(Location next) {
        double x = this.latitude-next.latitude;
        double y = this.longitude-next.longitude;

        return Math.sqrt(x*x + y*y);
    }
}

abstract class User {
    protected String name;
    protected String email;
    protected Location location;

    public User(String name, String email, Location location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public abstract void notify(String message);

}

class Driver extends User {
    public Vehicle vehicle;
    public Driver(String name, String email, Location location, Vehicle vehicle) {
        super(name, email, location);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void notify(String msg) {
        System.out.println(msg);
    }
}


class Passenger extends User {
    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }
    public void notify(String msg) {
        System.out.println(msg);
    }

}

abstract class Vehicle {
    public String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    public abstract double getFarePerKm();
}

class Car extends Vehicle {
    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double getFarePerKm() {
        return 20;
    }
}

class Bike extends Vehicle {
    public Bike(String numberPlate) {
        super(numberPlate);
    }
    @Override
    public double getFarePerKm() {
        return 12;
    }
}

// There are 3 different part of the fare like standard, luxury, premium.

interface FareStrategy {
    double calFare(Vehicle vehicle, double distance);
}

class StandardFareStrategy implements FareStrategy {
    @Override
    public double calFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }
}

class SharedFareStrategy implements FareStrategy {
    @Override
    public double calFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 0.50;
    }
}

class PremiumFareStrategy implements FareStrategy {
    @Override
    public double calFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 3.50;
    }
}


class Ride {
    private Passenger passenger;
    private Driver driver;
    private double distance;
    private FareStrategy fareStrategy;
    private double fare;
    private RideStatus status;
    public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStrategy = fareStrategy;
        this.status = RideStatus.SCHEDULE;
    }
    public void calculatedFare() {
        this.fare = fareStrategy.calFare(driver.getVehicle(),distance);
    }
    public void updateStatus(RideStatus status) {
        this.status = status;
        notifyUsers(status);
        // The Observer pattern and the notify for the update.
    }
    private void notifyUsers(RideStatus status) {
        passenger.notify("The ride is - "+status);
        driver.notify("Driver ride is - "+status);
    }
    public double getFare() {
        return fare;
    }
}


enum RideStatus {
    SCHEDULE,ONGOING, COMPLETED;
}