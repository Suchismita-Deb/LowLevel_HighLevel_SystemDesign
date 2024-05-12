package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode;

public class SpecialDriveStrategy implements DriveStrategy{
        @Override
        public void drive() {
            System.out.println("Special Drive Strategy.");
        }
}
