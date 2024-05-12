package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
