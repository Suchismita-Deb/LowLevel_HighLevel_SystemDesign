# Prototype Design Pattern.

It is used to make a copy/clone of the existing object. 
Say the class has lot of instance variable and it is very expensive.
One instance value is private that cannot be copied. In the example obj1 cannot copy the roll number.

Say the student has 100 instance variable and we have to copy for 98 variable then the client needs to know about all the variable and clone the value.
According to the Prototype model the clone method should be managed by the class and not the client. Every class will have the clone method. 

The class manage the clone method so the private value will also be covered.

The prototype will be an interface and it will have the clone method and all the class will implement the method.


Example.
A board game where you need to save the current state of the hame at various points. Instead of manually creating new board objects and copying all the pieces of teh states we use the Prototype pattern to clone the board.


The copy of the board is needed say like going to the previous state of the board.

The code clearly pointing the issue like making an entire new copy of the board is not a solution. The main method will not make the copy of the board.

The Prototype Pattern and the game piece and the element will provide its own clone() method allowing the entire board to be easily cloned with the current state.

There is an interface and a clone() method and any class in the game will implement the method and create the clone() method. In the prototype pattern we decouple the complexity of cloning the board from the client ensuring that each object knows how to clone itself and making the system flexible and easier to maintain.