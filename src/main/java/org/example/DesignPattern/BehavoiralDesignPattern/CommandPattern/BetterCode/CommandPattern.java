package org.example.DesignPattern.BehavoiralDesignPattern.CommandPattern.BetterCode;

public class CommandPattern {
    public static void main(String[] args) {
        TextEditor newTextEditor = new TextEditor();
        // The same button can be used to many kind of action.
        Button button = new Button();
        button.setCommand(new BoldCommand(newTextEditor));
        button.click();
    }
}

interface Command {
    void execute();
}

class BoldCommand implements Command {
// The BoldCommand will hold the reference of the TextEditor. The Button will not hold the reference of the TextEditor.
    private TextEditor textEditor;
    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.boldText();
    }
    // When the bold button then the boldCommand class to call and the bold method is not part of the main method.
}

class Button{
    Command command;
    // Button will hold the reference of any command like Bold, Undo.
    void setCommand(Command command) {
        this.command = command;
    }
    void click() {
        command.execute();
    }
}

// The target Button is decoupled and it does not know about the command and the command can be anything the interface will have many concrete classes.

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