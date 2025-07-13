package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

public abstract class AbstractLogger {
  int level;
  // It will show the level of logging like info is 1 and error say 2 and debug say 3.
  // When level is 3 then it should print all like infor, error and debug.

  // Set the next logging level.
  AbstractLogger nextLoggingLevel;

  public void setNextLoggingLevel(AbstractLogger nextLoggingLevel) {
    this.nextLoggingLevel = nextLoggingLevel;
  }

  // Use the next logging level.
  // The chain of responsibility.
  void logMessage(int level, String msg, LogSubject logSubject) {
    if (this.level <= level) {
      display(msg, logSubject);
    }
    if (nextLoggingLevel != null) {
      // Use the nextLoggingLevel.
      nextLoggingLevel.logMessage(level, msg, logSubject);
    }
  }

  protected abstract void display(String msg, LogSubject logSubject);
}
