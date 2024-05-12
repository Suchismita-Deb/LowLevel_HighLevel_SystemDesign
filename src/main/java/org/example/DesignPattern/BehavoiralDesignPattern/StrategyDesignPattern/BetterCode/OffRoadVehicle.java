package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDriveStrategy());
        // Created a constructor.
        // Inside that parent class we are passing the new SpecialDriveStrategy();
    }
}
