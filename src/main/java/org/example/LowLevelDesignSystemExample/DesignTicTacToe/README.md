A 3 X 3 game board.   
The game played by human.  
It is a 2 player game.   
Alternate turn between 'X' and 'O'.  
Move validation to ensure no valid move.   
Detection of win or draw scenarios.

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

What can change?              → Strategy
What states does game have?  → State
Who needs notification?      → Observer
How are objects created?     → Factory
How are dependencies given?  → Constructor DI

Player → makeMove()
→ Board validates move
→ Board updates cell
→ Check Win / Draw
→ GameState changes
→ Notify Observer
→ Switch player

Strategy Pattern — Player Interaction.  
Different players can have different ways of making a move.
```java
interface PlayerStrategy {
    Position makeMove(Board board);
}

class HumanPlayerStrategy implements PlayerStrategy {
    public Position makeMove(Board board) {
        // take row/column from user
        return new Position(row, col);
    }
}
```

State Pattern — Game State.  
Game has different states

```java
interface GameState {
    void handle(GameContext context);
}

class XTurnState implements GameState {
    public void handle(GameContext context) {
        // X player's turn
    }
}

class OTurnState implements GameState {
    public void handle(GameContext context) {
        // O player's turn
    }
}
```

Observer Pattern — Notifications.  
When a move/state changes, listeners can be notified.

```java
interface GameEventListener {
    void onMove(Position position, Symbol symbol);
}

class ConsoleGameEventListener implements GameEventListener {
    public void onMove(Position position, Symbol symbol) {
        System.out.println(symbol + " moved");
    }
}

for (GameEventListener listener : listeners) {
        listener.onMove(position, symbol);
}
```

Factory Pattern — Player Creation.  
Player creation can be centralized.   
HOW should objects be created? → Factory

```java
class PlayerFactory {

    Player createPlayer(Symbol symbol, PlayerStrategy strategy) {
        return new Player(symbol, strategy);
    }
}
```

Constructor DI.  
Dependencies are passed through the constructor.

```java
class TicTacToeGame {

    private final Board board;
    private final Player playerX;
    private final Player playerO;

    TicTacToeGame(Board board,
                  Player playerX,
                  Player playerO) {
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;
    }
}
```

Don't create dependencies inside the class → inject them.