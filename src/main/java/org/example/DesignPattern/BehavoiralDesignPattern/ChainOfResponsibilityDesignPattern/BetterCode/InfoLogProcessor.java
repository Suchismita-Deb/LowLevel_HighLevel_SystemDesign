package org.example.DesignPattern.BehavoiralDesignPattern.ChainOfResponsibilityDesignPattern.BetterCode;

public class InfoLogProcessor extends LogProcessor{

    // When will make the infoLogProcessor then we will mention the nextLogProcessor like the chain of all the processor.
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message){
        if(logLevel==INFO){
            System.out.println("Info "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }


}