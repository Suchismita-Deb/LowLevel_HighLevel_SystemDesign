This pattern is mainly used to store the Object history. Like to do the UNDO functionality.

It is also called as Snapshot Design Pattern.

We want we can keep the snapshot and whenever we want we can revert back to that state.

Memento Design Pattern has 3 major category.
Originator - It represents the object for which the state needs to be saved and restored. 
It represents the object which we need to save.
Exposed methods to Save and Restore its state using memento object.
Memento - It represents an object which holds the state of the Originator.
Caretaker - Manages the list of state.



Originator has what to save in the memento and what to restore in the memento.


memento.png


