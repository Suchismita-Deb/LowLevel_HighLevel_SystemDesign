package org.example.DesignPattern.BehavoiralDesignPattern.ChainOfResponsibilityDesignPattern.BetterCode;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        // This is the chain of responsibility.
        logObject.log(2,"Exception message");
        // The chain is made of info. First info will be called then the message did not match so in the super it wil call the next and then it will see the next in the chain is debug and again pass next to the super and it is error so it will print.
        logObject.log(3,"Need to debug this.");
        logObject.log(1,"Just for info.");
    }
}
