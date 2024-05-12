package org.example.LiskovSubstitutionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bike());
        vehicleList.add(new Bicycle());

        for(Vehicle v:vehicleList){
            System.out.println(v.getWheelCount());
        }
        // Here will not able to call the hasEngine() as it is a list of Vehicle and it does not have the method.
        // So will not get the compile time exception.
    }
}
