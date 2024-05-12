package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.BetterCodeDoubt;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String,RobotType> cacheObject = new HashMap<>();
    public static RobotType createObject(String type){
        if(cacheObject.containsKey(type)){
            return cacheObject.get(type);
        }
        else{
            RobotType newType = new RobotType("humanRobot");
            cacheObject.put("humanRobot",newType);
            return cacheObject.get(type);
        }
    }
}
