package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.Example1.BetterCode;

public interface State {
    void insertCoin(VendingMachine vendingMachine);
    void dispenseProduct(VendingMachine vendingMachine);
}
