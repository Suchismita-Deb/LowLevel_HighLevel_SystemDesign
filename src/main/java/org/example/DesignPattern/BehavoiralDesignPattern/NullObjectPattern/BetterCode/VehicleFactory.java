package org.example.DesignPattern.BehavoiralDesignPattern.NullObjectPattern.BetterCode;

public class VehicleFactory{
    static Vehicle getVehicleObject(String type){
        if("Car".equalsIgnoreCase(type)){
            return new Car();
        }
        else
            return new NullObject();
    }
}
