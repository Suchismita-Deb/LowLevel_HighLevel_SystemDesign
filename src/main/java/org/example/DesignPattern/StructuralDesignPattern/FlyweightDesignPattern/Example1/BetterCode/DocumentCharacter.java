package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example1.BetterCode;

public class DocumentCharacter implements ILetter{

    private char character;
    private String fontType;
    private int fontSize;
    DocumentCharacter(char character, String fontType, int fontSize) {
        this.character = character;
        this.fontType = fontType;
        this.fontSize = fontSize;
    }
    @Override
    public void position(int row, int col) {

    }
}
