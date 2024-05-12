package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        ILetter character1 = LetterFactory.createObject('t');
        character1.position(0,8);
        ILetter character2 = LetterFactory.createObject('t');
        character1.position(0,14);
        ILetter character3 = LetterFactory.createObject('i');
        character1.position(0,12);
    }
}
