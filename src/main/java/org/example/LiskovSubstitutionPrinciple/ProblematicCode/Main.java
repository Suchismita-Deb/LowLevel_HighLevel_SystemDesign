package org.example.LiskovSubstitutionPrinciple.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> l = new ArrayList<>();
        l.add(new Car());
        l.add(new Bike());

        // cannot make the bicycle as it has no engine and the return is null. null.toString() will give exception.

        for(Vehicle v:l){
            System.out.println(v.engine().toString());
        }
    }
}
