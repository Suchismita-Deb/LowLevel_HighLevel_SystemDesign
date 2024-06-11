package org.example.DesignPattern.BehavoiralDesignPattern.ChainOfResponsibilityDesignPattern.BetterCode;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==DEBUG){
            System.out.println("Debug "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
