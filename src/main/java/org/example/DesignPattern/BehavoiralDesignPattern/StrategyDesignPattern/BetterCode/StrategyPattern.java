package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class StrategyPattern {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}

class Vehicle {
    DriveStrategy driveObject;
    // Will not make like new NormalDriveStrategy. It is only the object of DriveStrategy.

    // Constructor Injection.
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }
    // When will call the child then will pass the value in the constructor.

    public void drive() {
        driveObject.drive();
        // It will call the drive method of the driveObject.
    }
}

class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}

class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SpecialDriveStrategy());
        // Created a constructor. Inside that parent class we are passing the new SpecialDriveStrategy();
    }
}

class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}

class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy.");
    }
}

interface DriveStrategy {
    void drive();
}

class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Drive Strategy.");
    }
}