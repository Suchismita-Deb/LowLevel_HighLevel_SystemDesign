The application like chatRoom - each user can send messages to all other users. 

When user send messages to each other directly the complexity increases as more users are added.

Each user must know about every other user and creating a complex web of communication and dependencies.

In the code we see that the user will make the application a communication web.
The solution using the mediator pattern where the participants communicate through a central chat mediator reducing the need for each participants to be aware of the others.


Example - Mediator - Chat server.   
User - Chat participants send messages to the mediator which distributes the message to others.


The Mediator Pattern structure.
ChatMediator Interface - Declares the sendMessage method which all mediators must implement.
Concrete Mediator - The ChatRoom class implements the ChatMediator interface. It hold a list of users and handles message broadcasting.

User Class - Each User object represents a participant in the chat. When a user sends a message the sendMessage method in the ChatRoom mediator is called which distributes the message to all users except the sender.
Communication - Users interact only with the ChatRoom(mediator) which facilitates communication between them removing direct dependencies between users.