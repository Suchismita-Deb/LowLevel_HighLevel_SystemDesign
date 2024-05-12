package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
