package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

public class Application{
    public static void main(String args[]){
        Logger logger = Logger.getInstance();
        logger.info("This is info.");

        logger.error("This is error.");
        // Only the error is giving the messga eof error and info. Error has more priority than info.
    }
}
