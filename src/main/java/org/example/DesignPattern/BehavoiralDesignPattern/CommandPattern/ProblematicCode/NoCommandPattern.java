package org.example.DesignPattern.BehavoiralDesignPattern.CommandPattern.ProblematicCode;

public class NoCommandPattern {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        BoldButton boldButton = new BoldButton(te);
        boldButton.click();
    }
}
class BoldButton {
    // There is onclick method and the bold method will be called inside the TextEditor.

    // The bold method is in TextEditor so there is a reference of the class inside the Button.
    TextEditor textEditor;
    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
        // When there is BoldButton then we have to initialize the text Editor.
    }

    public void click() {
        textEditor.boldText();
    }
}
class ItalicButton {
    TextEditor editor;
    public ItalicButton(TextEditor textEditor) {
        this.editor = textEditor;
    }
    public void click() {
        editor.italicText();
    }
}
class UnderlineButton {
    TextEditor textEditor;
    public UnderlineButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.underlineText();
    }
}

class TextEditor {
    public void boldText(){
        System.out.println("Text is in bold.");
    }
    public void italicText(){
        System.out.println("Text is in italic.");
    }
    public void underlineText(){
        System.out.println("Text is in underline.");
    }
}