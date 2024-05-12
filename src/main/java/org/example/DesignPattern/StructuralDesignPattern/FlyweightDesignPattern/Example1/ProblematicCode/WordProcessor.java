package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example1.ProblematicCode;

public class WordProcessor {
    private char character;
    private String fontType;
    private int fontSize;
    private int row;
    private int col;

    WordProcessor(char character, String fontType, int fontSize, int row, int col){
        this.character = character;
        this.fontType = fontType;
        this.fontSize = fontSize;
        this.row = row;
        this.col = col;
    }

}
