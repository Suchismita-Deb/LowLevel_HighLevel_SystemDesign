package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Impl;//package May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Impl;
//
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Coin;
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.State;
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.VendingMachine;
//
//import java.util.List;
//
//public class SelectionState implements State {
//
//    public SelectionState(){
//        System.out.println("Vending machine is in selection state.");
//    }
//
//    @Override
//    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
//        throw new Exception("You cannot click on Insert coin button.");
//    }
//
//    @Override
//    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
//        return;
//    }
//
//    @Override
//    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
//        System.out.println("You cannot click on insert coin button in the Selection State.");
//    }
//
//    @Override
//    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
//
//    }
//
//    @Override
//    public int getChange(int returnExtraMoney) throws Exception {
//        return returnExtraMoney;
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
//        throw new Exception("You cannot be dispensed product in the selection state.");
//    }
//}
