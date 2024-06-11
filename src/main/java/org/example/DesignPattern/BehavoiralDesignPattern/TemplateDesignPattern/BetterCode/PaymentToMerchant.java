package org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.BetterCode;

public class PaymentToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate for the PaymentToFriend");
    }
    @Override
    public void debitAmount() {
        System.out.println("Debit the amount Payment To Merchant. ");
    }
    @Override
    public void calculateFees() {
        System.out.println("2% fees charged.");
    }



    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining amount.");
    }
}
