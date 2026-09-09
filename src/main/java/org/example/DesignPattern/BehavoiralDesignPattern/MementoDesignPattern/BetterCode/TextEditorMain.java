package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.BetterCode;

public class TextEditorMain {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        editor.write("Hello World.");
        careTaker.saveState(editor);

        editor.write("Hello Everyone.");
        careTaker.saveState(editor);

        editor.write("Hello Everyone Test.");
        careTaker.saveState(editor);
        careTaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
