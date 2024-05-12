package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example.BetterCode;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String,IRobot> robotFactoryCache = new HashMap<>();

    public static IRobot createRobot(String type){
        if(robotFactoryCache.containsKey(type)){
            return robotFactoryCache.get(type);
        }
        else{
            if(type=="humanRobot"){
                IRobot humanRobotObject = new HumanRobot(type);
                robotFactoryCache.put(type,humanRobotObject);
                return humanRobotObject;
            }
            else if(type=="roboticDog"){
                IRobot roboticDogObject = new RoboticDog(type);
                robotFactoryCache.put(type,roboticDogObject);
                return roboticDogObject;
            }
        }
        return null;
    }
}
