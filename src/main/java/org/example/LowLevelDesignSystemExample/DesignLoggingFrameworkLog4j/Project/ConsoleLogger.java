package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

public class ConsoleLogger implements LogObserver{
    @Override
    public void log(String msg){
        System.out.println("CONSOLE - "+msg);
    }
}
