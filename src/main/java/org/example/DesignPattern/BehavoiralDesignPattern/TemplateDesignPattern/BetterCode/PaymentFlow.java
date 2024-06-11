package org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.BetterCode;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();
    // This is the template method which will defines the order of the steps to execute the task.
    public final void sendMoney(){
        // step1.
        validateRequest();
        // step2.
        debitAmount();
        // step3.
        calculateFees();
        //step4.
        creditAmount();
    }
}
