package org.example.DesignPattern.BehavoiralDesignPattern.MementoDesignPattern.BetterCode;

public class TextEditor {
    private String text;

    public void write(String text) {
        this.text = text;
    }

    public String getContent() {
        return text;
    }

    // Save the current state of editor.
    public EditorMemento save(){
        return new EditorMemento(text);
    }

    // Restore (Memento - update the state of current content)
    public void restore(EditorMemento memento){
        text = memento.getContent(); // The state that is given will update the text based on the state.
    }
    // The state management is done by the CareTake
}
