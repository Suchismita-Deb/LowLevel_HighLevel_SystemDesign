package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode1;

public class StrategyPattern {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCardPayment());
        paymentService.pay();
        paymentService.setPaymentStrategy(new DebitCardPayment());
        paymentService.pay();
        // The new payment strategy will add a class and no touch to existing code.
    }
}

class PaymentService {
    private PaymentStrategy strategy;

    // Method to set the strategy.
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay() {
        strategy.processPayment();
        // The method is present in the interface and the concrete classes (inside the strategy) that will implement the interface.
    }
}

interface PaymentStrategy {
    void processPayment();
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment via credit card.");
    }
}

class DebitCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment via debit card.");
    }
}