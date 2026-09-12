A 3 X 3 game board.   
The game played by human.  
It is a 2 player game.   
Alternate turn between 'X' and 'O'.  
Move validation to ensure no valid move.   
Detection of win or draw scenarios.

The booking supports multiple screen in the theatre showing different movies.

It manages the concurrent booking attempts to prevent double bookings. There is session timeout to release seats if the
payment is not completed.

Temporary seat locking during the booking process. Seat status tracking like the availability, temporarily unavailable,
not available.

### Steps to proceed in the interview.

Make the entity and the task.

Give the idea of the design and the pattern to use.   
Tell the name of the pattern to use sound confident and mention. The design pattern take time and you take time in the
implementation of the part and still tell the names.

There is GameState - It will maintain player turn and completion condition.

Validation - Verify each move inside the boundary and in empty cell.

Track player turn.

GameCompletion - Win or Draw.

### Tips.

In most of the problem we can use Strategy and Factory.
In many problem we want to show something to the user so the observer pattern.

In the application there are state like the players turn and it can be done by the State Pattern.

Not a good place to use all but still you can say the name. The main point is 45 mins is not enough so to put everything
so its better to say the name and make them know that you are aware of the design pattern and you can implement it.

Strategy Pattern - A Player interface with a makeMove() method implement differently for the human and AI.

Observer Pattern - It will notify the user so we can use Observer Pattern.

### Key component.

Theatre - Represents the physical theatre with screens.  
Screen - Represents a movie screen within the theatre.  
Movie, Show - Time and screen, Seat, User, Seat LockProvider - Common interface for locking mechanism during ticket
booking.

### Pattern.

How to approach the design challenges?

Tip - Name the parts that are imp and the design pattern you are planning to implement.

Repository Pattern - There are many services like the MovieService and TheatreService acting as repository managing the
collection of entities. They handle the creation, retrieval and management of domain objects.

Strategy Pattern Seat Locking Mechanism - A family of locking algorithm and makes them interchangeable. The booking system to support various locking methods like db-backed or distributed lock provider.

Controller/Handler/Manager - Service Pattern - The separation of concerns by delegating HTTP request handling to controllers and the business logic to the service class.

DI - The system will be using the constructor based

Strategy Pattern for Player Interactions - PlayerInterface that define different move like move from AI and user input from human. The method makeMove() will be implemented differently by players.

State Pattern - The different game state like the in-progress, won and draw. The GameState will be used to maintain the transition between states based on the game conditions.

Observer Pattern - Notify the listeners about the GameState change. A GameEventListener that get notified when a player makes a move or the game state changed.

Factory Pattern for Player Creation - Player and the interface use a factory to instantiate player object.