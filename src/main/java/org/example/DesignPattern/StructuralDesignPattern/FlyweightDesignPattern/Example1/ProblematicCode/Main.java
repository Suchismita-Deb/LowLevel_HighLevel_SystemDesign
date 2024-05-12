package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        // This is the data.
        // Total - 16 character.
        // t - 2, a - 2, i - 2 and so on.
        WordProcessor c1 = new WordProcessor('t',"Ariel",12,0,8);
        WordProcessor c2 = new WordProcessor('t',"Ariel",12,0,14);
        WordProcessor c3 = new WordProcessor('i',"Ariel",12,0,2);
    }
}
