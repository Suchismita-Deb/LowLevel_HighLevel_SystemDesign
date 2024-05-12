package org.example.LiskovSubstitutionPrinciple.ProblematicCode;

public class Car extends Vehicle{
    @Override
    public Integer getWheelCount(){
        return 4;
    }
}
