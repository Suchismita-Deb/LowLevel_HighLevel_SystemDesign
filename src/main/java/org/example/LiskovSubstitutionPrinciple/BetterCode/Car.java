package org.example.LiskovSubstitutionPrinciple.BetterCode;

public class Car extends Engine{
    @Override
    public Integer getWheelCount(){
        return 4;
    }
}
