package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.ProblematicCode;

public class TextEditor{
    private String text;

    public void write(String text) {
        this.text = text;
    }

    public String getContent() {
        return text;
    }

}
