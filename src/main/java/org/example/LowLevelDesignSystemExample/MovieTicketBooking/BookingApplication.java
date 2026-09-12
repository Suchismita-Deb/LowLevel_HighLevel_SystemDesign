package org.example.LowLevelDesignSystemExample.MovieTicketBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingApplication {
    public static void main(String[] args) {
        PlayerStrategy playerXStrategy = new HumanPlayerStrategy("Player X");
        PlayerStrategy playerOStrategy = new HumanPlayerStrategy("Player O");
        TicTacToeGame game = new TicTacToeGame(playerXStrategy, playerOStrategy, 3, 3);
        game.play();
    }
}

interface PlayerStrategy {
    Position makeMode(Board board);
    // The player strategy for the Human and AI and teh task is with the Human.
}


class HumanPlayerStrategy implements PlayerStrategy {

    private Scanner scanner;
    private String playerName;

    public HumanPlayerStrategy(String playerName) {
        this.playerName = playerName;
        scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMode(Board board) {
        while (true) {
            System.out.println(playerName + " Enter your move row[0-2] and col[0-2]");
            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Position move = new Position(row, col);
                if (board.isValidMove(mode)) {
                    return move;
                }
                System.out.println("Invalid move. Try again.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter two integers for row and col.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
// The strategy move and easy to make the new player strategy like AI or networked player.

class Position {
    // It represents the row and col of the board.

    int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}

enum Symbol {
    X, O, EMPTY
}

class Board {
    // The class represents the board of any size.

    // It include the method for validating the moves, making moves and see the game state.
    private final int rows;
    private final int columns;
    private Symbol[][] grid;
    private List<GameEventListener> listeners;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new Symbol[rows][columns];
        listeners = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void addListerner(GameEventListener listener) {
        listeners.add(listener);
    }

    // Notifies users whever a move is been made
    public void notifyMoveMade(Position position, Symbol symbol) {
        for (GameEventListener listener : listeners) {
            listener.onMoveMade(position, symbol);
        }
    }

    // Notifies user on change of game state
    public void notifyGameStateChanged(GameState state) {
        for (GameEventListener listener : listeners) {
            listener.onGameStateChanged(state);
        }
    }

    public boolean isValidMove(Position pos) {
        return pos.row >= 0 && pos.row < rows && pos.col >= 0 && pos.col < cols && grid[pos.row][pos.col] == Symbol.EMPTY;
    }

    public void makeMove(Position pos, Symbol symbol) {
        grid[pos.row][pos.col] = symbol;
        notifyMoveMade(pos, symbol);
    }

    public void checkGameState(GameContext context) {
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] != Symbol.EMPTY && isWinningLine(grid[i])) {
                GameState newState =
                        grid[i][0] == Symbol.X ? new XWonState() : new OWonState();
                context.setState(newState);
                notifyGameStateChanged(
                        newState); // Notify listeners when the game state changes
                return;
                ;
            }
        }
        for (int i = 0; i < columns; i++) {
            Symbol[] column = new Symbol[rows];
            for (int j = 0; j < rows; j++) {
                column[j] = grid[j][i];
            }
            if (column[0] != Symbol.EMPTY && isWinningLine(column)) {

                GameState newState =
                        column[0] == Symbol.X ? new XWonState() : new OWonState();
                context.setState(newState);
                notifyGameStateChanged(
                        newState); // Notify listeners when the game state changes
                return;
            }
        }
        Symbol[] diagonal1 = new Symbol[Math.min(rows, columns)];
        Symbol[] diagonal2 = new Symbol[Math.min(rows, columns)];
        for (int i = 0; i < Math.min(rows, columns); i++) {
            diagonal1[i] = grid[i][i];
            diagonal2[i] = grid[i][columns - 1 - i];
        }
        if (diagonal1[0] != Symbol.EMPTY && isWinningLine(diagonal1)) {
            GameState newState =
                    diagonal1[0] == Symbol.X ? new XWonState() : new OWonState();
            context.setState(newState);
            notifyGameStateChanged(
                    newState); // Notify listeners when the game state changes
            return;
        }
        if (diagonal2[0] != Symbol.EMPTY && isWinningLine(diagonal2)) {

            GameState newState =
                    diagonal2[0] == Symbol.X ? new XWonState() : new OWonState();
            context.setState(newState);
            notifyGameStateChanged(
                    newState); // Notify listeners when the game state changes
            return;
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (grid[row][col] == Symbol.EMPTY) {
                    context.setState(new InProgressState());
                    return;
                }
            }
        }
        context.setState(new DrawState());
        notifyGameStateChanged(
                new DrawState()); // Notify listeners when the game state changes
    }

    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol s : line) {
            if (s != first) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Symbol symbol = grid[i][j];
                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" . ");
                }
                if (j < cols - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}

class Player {
    // Each player (X or O) take turn and it store the player symbol and the strategy of making moves.
    Symbol symbol;
    PlayerStrategy playerStrategy;

    public Player(Symbol symbol, PlayerStrategy playerStrategy) {
        this.symbol = symbol;
        this.playerStrategy = playerStrategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }
}

enum SeatStatus {
    CREATED, CONFIRMED, BOOKED
}

enum SeatStrategy {
    SILVER, GOLD, PLATINUM
}


// The State Pattern.
// It will alter the behaviour when the internal state changes. GameStateEnum defines the state and each state has a value to indicate whether the game is over.

interface GameState {
    void next(GameContext context, Player player, boolean hasWon);

    boolean isGameOver();
}

class XTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        if (hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        } else {
            context.setState(new OTurnState());
        }
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}

class OTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        if (hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
        }
        context.setState(new XTurnState());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}

class XWonState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        // No next state as game is over.
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}

class OWonState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        // No next state.
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}

class GameContext {
    private GameState currentState;

    public GameContext() {
        currentState = new XTurnState(); // Start with X's turn
    }
    public void setState(GameState state) {
        this.currentState = state;
    }
    public void next(Player player, boolean hasWon) {
        currentState.next(this, player , hasWon);
    }
    public boolean isGameOver() {
        return currentState.isGameOver();
    }
    public GameState getCurrentState() {
        return currentState;
    }
}

interface BoardGame {
    void play();
}

class TicTacToeGame implements BoardGame {
    private Board board;
    private List<Player> players;
//    private Player currentPlayer;
    private int currentPlayerIndex;

    public TicTacToeGame(int boardSize,List<PlayerStrategy> strategies, PlayerFactory playerFactory) {
        board = new Board(boardSize);
        players = new ArrayList<>();
        for (int i = 0; i < strategies.size(); i++) {
            Symbol symbol =
                    Symbol.values()[i]; // Assign a unique symbol to each player
            players.add(playerFactory.createPlayer(
                    symbol, strategies.get(i))); // Use the factory to create players
        }
        currentPlayerIndex = 0;
    }
    private Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }
    // Method to switch to the next player
    private void switchPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

    @Override
    // Loop continues until the game state indicates that the game is over.
    public void play() {
        GameState gameState;
        do {
            board.printBoard();
            Player currentPlayer = getCurrentPlayer();
            Position move = currentPlayer.makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());


            gameState = board.checkGameState();
            switchPlayer();
        } while (!gameState.isGameOver());


        announceResult(gameState);
    }
    // Displays the outcome of the game based on the final game state.
    private void announceResult(GameState state) {
        switch (state) {
            case X_WON:
                System.out.println("Player X wins!");
                break;
            case O_WON:
                System.out.println("Player O wins!");
                break;
            case DRAW:
                System.out.println("It's a draw!");
                break;
    }
}

// Observer Pattern
// GameEventListener Interface
interface GameEventListener {
    void onMoveMade(Position position, Symbol symbol);

    void onGameStateChanged(GameState state);
}

// Concrete Listener Class
class ConsoleGameEventListener implements GameEventListener {
    @Override
    public void onMoveMade(Position position, Symbol symbol) {
        System.out.println("Move made at position: " + position + " by " + symbol);
    }

    @Override
    public void onGameStateChanged(GameState state) {
        System.out.println("Game state changed to: " + state);
    }
}

// PlayerFactory Interface
interface PlayerFactory {
    Player createPlayer(Symbol symbol, PlayerStrategy strategy);
}


// Concrete PlayerFactory Class
class SimplePlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer(Symbol symbol, PlayerStrategy strategy) {
        return new Player(symbol, strategy);
    }
}