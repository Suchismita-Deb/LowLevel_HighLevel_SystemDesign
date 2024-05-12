package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy.");
    }
}
