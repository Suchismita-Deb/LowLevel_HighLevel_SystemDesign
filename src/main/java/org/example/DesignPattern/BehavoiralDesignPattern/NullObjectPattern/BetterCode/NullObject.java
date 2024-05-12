package org.example.DesignPattern.BehavoiralDesignPattern.NullObjectPattern.BetterCode;

public class NullObject implements Vehicle{
    @Override
    public int getSeatCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
