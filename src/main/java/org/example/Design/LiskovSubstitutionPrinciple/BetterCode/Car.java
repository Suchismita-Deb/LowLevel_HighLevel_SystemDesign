package org.example.Design.LiskovSubstitutionPrinciple.BetterCode;

public class Car extends Engine{
    @Override
    public Integer getWheelCount(){
        return 4;
    }
}
