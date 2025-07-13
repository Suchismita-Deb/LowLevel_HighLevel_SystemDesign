package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

public class LogManager{
    protected static LogSubject buildSubject(){
        LogSubject logSubject = new LogSubject();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        logSubject.addObserver(1,consoleLogger);
        // The level 1 message is in console Logger.
        logSubject.addObserver(2,fileLogger);
        return logSubject;
    }
    protected static AbstractLogger buildChainOfLogger(){
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLoggingLevel(errorLogger);
        errorLogger.setNextLoggingLevel(debugLogger);

        return infoLogger;
    }
}
