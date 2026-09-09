There is a application like the TextEditor and the interface has the button like Bold, Underline and there are other application like Notepad same button like Bold and Underline. 

In case of not using the command then the Bold and Underline is separately implemented in the method. Put aside the 2 application like the Text and Notepad in one application it is better to make the button an interface and the implement it separately. In case there is undo and redo button added then the code again has to be done separately.

The problematic code showing that each button class is tightly coupled with the TextEditor and in case any action change then al button classes needs to be modified.

In command we make the button a separate interface and implement the code inside the application. The button no longer need to know about the editor directly but instead work with the generic Command objects.

In the Better code there is a single Button and that is used to make bold, change color or anything. The new keyword will not be used much in the pattern and the button can work with multiple task.