package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

class DebugLogger extends AbstractLogger {
  public DebugLogger(int level) {
    this.level = level;
  }

  @Override
  protected void display(String msg, LogSubject logSubject) {
    String message = "DEBUG - " + msg;
    logSubject.notifyAllObserver(3, message);
    System.out.println(message);
  }
}
