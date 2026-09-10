package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.ProblematicCode1;

public class NoBuilderHouse {

    private String foundation;
    private String name;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    // The constructor overloading is not possible.
    public NoBuilderHouse(String foundation){}

    // public NoBuilderHouse(String roof){}
    // The constructor with the same parameter is not possible and the default of the optional should be true. The flexibility is not there in the code.
}
