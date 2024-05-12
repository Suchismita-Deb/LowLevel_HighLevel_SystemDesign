package org.example.DesignPattern.BehavoiralDesignPattern.NullObjectPattern.ProblematicCode;

public class Vehicle {
    String type;

    public String getVehicleName(String type) {
        if(type=="XUV"){
            return "M&M";
        }
        return null;
    }

    public int getSeatingCapacity() {
        return 5;
    }
}
