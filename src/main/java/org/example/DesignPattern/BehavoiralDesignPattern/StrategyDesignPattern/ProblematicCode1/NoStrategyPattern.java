package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.ProblematicCode1;

public class NoStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CreditCard");
        paymentService.processPayment("DebitCard");
        paymentService.processPayment("UPI");
    }

    // To make a new PaymentService we have to use additional changes in the PaymentService class which is already tested.
}

class PaymentService{
    public void processPayment(String paymentMethod) {
        if(paymentMethod.equals("CreditCard")) {
            System.out.println("Payment vis credit card.");
        }
        else if(paymentMethod.equals("DebitCard")) {
            System.out.println("Payment vis debit card.");
        }
        else {
            System.out.println("Unsupported Payment Method.");
        }
    }
}