package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

class ErrorLogger extends AbstractLogger {
  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  protected void display(String msg, LogSubject logSubject) {
    String message = "ERROR - " + msg;
    logSubject.notifyAllObserver(2, message);
    System.out.println(message);
  }
}