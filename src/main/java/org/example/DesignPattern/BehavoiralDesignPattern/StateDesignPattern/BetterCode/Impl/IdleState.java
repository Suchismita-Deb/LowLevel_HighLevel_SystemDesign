package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Impl;//package May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Impl;
//
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.Coin;
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.State;
//import May.SpringCourse.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode.VendingMachine;
//
//import java.util.List;
//
//public class IdleState implements State {
//
//    public IdleState(){
//        System.out.println("Currently vending machine is in idle state.");
//    }
//
//    public IdleState(VendingMachine vendingMachine){
//        System.out.println("Currently vending machine is in idle state.");
//    }
//
//    @Override
//    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
//
//    }
//
//    @Override
//    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception {
//        throw new Exception("First click on insert coin button.");
//    }
//
//    @Override
//    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
//        throw new Exception("You cannot click on Insert coin in idle state.");
//    }
//
//    @Override
//    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
//        throw new Exception("You cannot choose product in idle state.");
//    }
//
//    @Override
//    public int getChange(int returnExtraMoney) throws Exception {
//        throw new Exception("You cannot get change in idle state.");
//    }
//
//    @Override
//    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
//        throw new Exception("You cannot get refund money in idle state.");
//    }
//
//    @Override
//    public void dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
//        throw new Exception("Product cannot be dispensed in idle state.");
//    }
//}
