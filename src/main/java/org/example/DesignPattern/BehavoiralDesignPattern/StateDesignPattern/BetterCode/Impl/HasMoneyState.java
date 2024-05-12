package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Impl;//package May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Impl;
//
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Coin;
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.State;
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.VendingMachine;
//
//import java.util.List;
//
//public class HasMoneyState implements State {
//
//    public HasMoneyState(){
//        System.out.println("Currently the Vending machine is in Has money state.");
//    }
//    @Override
//    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
//        return;
//    }
//
//    @Override
//    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
//        vendingMachine.setVendingMachineState(new SelectionState());
//    }
//
//    @Override
//    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
//        System.out.println("Accepted the coin.");
//        vendingMachine.getCoinList().add(coin);
//    }
//
//    @Override
//    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
//        System.out.println("You cannot choose product in the Has money state.");
//    }
//
//    @Override
//    public int getChange(int returnExtraMoney) throws Exception {
//        System.out.println("You cannot get change in Has money state.");
//    }
//
//    @Override
//    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
//        System.out.println("Returning the full amount back to the client.");
//        vendingMachine.setVendingMachineState(new IdleState());
//        return vendingMachine.getCoinList();
//    }
//
//    @Override
//    public void dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
//        System.out.println("Product cannot be dispersed in has money state.");
//    }
//}
