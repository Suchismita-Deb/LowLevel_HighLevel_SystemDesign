package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

public class FileLogger implements LogObserver{
    @Override
    public void log(String msg){
        System.out.println("FILE - "+msg);
    }
}
