package org.example.DesignPattern.BehavoiralDesignPattern.NullObjectPattern.BetterCode;

public class Bike implements Vehicle{

    @Override
    public int getSeatCapacity() {
        return 2;
    }

    @Override
    public int getTankCapacity() {
        return 10;
    }
}
