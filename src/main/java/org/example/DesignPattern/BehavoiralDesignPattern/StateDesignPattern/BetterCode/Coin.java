package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUATER(25);
    public int value;
    Coin(int value){
        this.value = value;
    }
}
