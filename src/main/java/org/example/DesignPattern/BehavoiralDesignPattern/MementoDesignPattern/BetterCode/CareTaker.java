package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.BetterCode;

import java.util.Stack;

public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();
    // The stack can store anything like Stack<String,String> like the heading, content.

    // To save the state call the saveText method.
    public  void saveState(TextEditor editor){
        history.push(editor.save());
        // There are one CareTaker for every TextEditor.
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            history.pop();
            editor.restore(history.peek());
        }
    }
}
