package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class Vehicle {
    DriveStrategy driveObject;
    // Will not make like new NormalDriveStrategy. It is only the object of DriveStrategy.

    // Constructor Injection.
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }
    // When will call the child then will pass the value in the constructor.

    public void drive(){
        driveObject.drive();
        // It will call the drive method of the driveObject.
    }
}
