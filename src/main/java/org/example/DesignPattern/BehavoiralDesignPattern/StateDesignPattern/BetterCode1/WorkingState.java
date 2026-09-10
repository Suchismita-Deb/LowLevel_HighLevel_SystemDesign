package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode1;

public class WorkingState implements State {
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        // nothing in this block.
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Product given to the customer.");
    }
}
