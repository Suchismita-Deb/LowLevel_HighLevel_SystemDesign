package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.Example1.BetterCode;

public class VendingMachine {
    State state;
    public State getState(){
        return state;
    }
    public void setState(State state){
        this.state = state;
    }
}
