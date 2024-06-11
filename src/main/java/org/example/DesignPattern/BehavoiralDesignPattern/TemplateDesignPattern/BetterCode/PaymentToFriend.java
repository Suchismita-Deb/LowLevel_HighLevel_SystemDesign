package org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.BetterCode;

import java.sql.SQLOutput;

public class PaymentToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Validate for the PaymentToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount Payment To Friend.");
    }

    @Override
    public void calculateFees() {
        System.out.println("No fees.");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount.");
  }
}
