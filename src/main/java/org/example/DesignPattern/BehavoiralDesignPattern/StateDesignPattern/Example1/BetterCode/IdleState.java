package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.Example1.BetterCode;

public class IdleState implements State{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted.");
        vendingMachine.setState(new WorkingState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        // nothing in the block.
    }
}
