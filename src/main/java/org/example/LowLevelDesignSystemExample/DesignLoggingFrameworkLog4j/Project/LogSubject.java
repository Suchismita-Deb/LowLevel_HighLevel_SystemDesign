package org.example.LowLevelDesignSystemExample.DesignLoggingFrameworkLog4j.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject{
    List<LogObserver> logObserver = new ArrayList<>();
    // Adding new observer, removing observer and notify observer.
    // Removing the observer can be done by the config file. The main one are the add and notify.
    Map<Integer, List<LogObserver>> logObservers = new HashMap<>();
    void addObserver(int level, LogObserver logObserver){
        // Adding the Observer in the map.
        // Integer is the level which it is logging.
        // Adding need two input like which part I have to add the observer and the level.
        List<LogObserver> logObserversList = logObservers.getOrDefault(level,new ArrayList<>());
        logObserversList.add(logObserver);
        logObservers.put(level,logObserversList);
    }
    void notifyAllObserver(int level, String msg){
        for(Map.Entry<Integer, List<LogObserver>> entry:logObservers.entrySet()){
            if(entry.getKey()==level){
                entry.getValue().forEach(observer -> observer.log(msg));
            }
        }
    }
}
