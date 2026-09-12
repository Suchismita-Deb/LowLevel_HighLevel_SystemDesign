package org.example.LowLevelDesignSystemExample.DesignTicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Strategy Pattern
        PlayerStrategy playerX =
                new HumanPlayerStrategy("Player X");

        PlayerStrategy playerO =
                new HumanPlayerStrategy("Player O");

        // Factory Pattern
        PlayerFactory playerFactory =
                new SimplePlayerFactory();

        TicTacToeGame game = new TicTacToeGame(
                3,
                3,
                playerX,
                playerO,
                playerFactory
        );

        // Observer Pattern
        game.addListener(new ConsoleGameEventListener());

        game.play();
    }
}


/* ============================================================
   POSITION
   ============================================================ */

class Position {

    private final int row;
    private final int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}

enum Symbol {
    X, O, EMPTY
}

interface PlayerStrategy {
    Position makeMove(Board board);
}
// We are making the HumanPlayer with the logic.
class HumanPlayerStrategy implements PlayerStrategy {

    private final Scanner scanner;
    private final String playerName;

    public HumanPlayerStrategy(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {

        while (true) {

            System.out.println(
                    playerName + " enter row and column:"
            );

            try {

                int row = scanner.nextInt();
                int col = scanner.nextInt();

                Position position =
                        new Position(row, col);

                if (board.isValidMove(position)) {
                    return position;
                }

                System.out.println(
                        "Invalid move. Try again."
                );

            } catch (Exception e) {

                System.out.println(
                        "Invalid input. Enter two integers."
                );

                scanner.nextLine();
            }
        }
    }
}


/* ============================================================
   PLAYER
   ============================================================ */

class Player {

    private final Symbol symbol;
    private final PlayerStrategy strategy;

    public Player(
            Symbol symbol,
            PlayerStrategy strategy
    ) {
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Position makeMove(Board board) {
        return strategy.makeMove(board);
    }
}


/* ============================================================
   OBSERVER PATTERN
   ============================================================ */

interface GameEventListener {

    void onMoveMade(
            Position position,
            Symbol symbol
    );

    void onGameStateChanged(
            GameState state
    );
}


/* ============================================================
   CONCRETE OBSERVER
   ============================================================ */

class ConsoleGameEventListener
        implements GameEventListener {

    @Override
    public void onMoveMade(
            Position position,
            Symbol symbol
    ) {

        System.out.println(
                "Move made at " +
                        position +
                        " by " +
                        symbol
        );
    }

    @Override
    public void onGameStateChanged(
            GameState state
    ) {

        System.out.println(
                "Game state changed to: " +
                        state.getName()
        );
    }
}


/* ============================================================
   BOARD
   ============================================================ */

class Board {

    private final int rows;
    private final int columns;

    private final Symbol[][] grid;

    public Board(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;

        grid = new Symbol[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    /*
     * Validate the move:
     * 1. Position must be inside board
     * 2. Cell must be empty
     */
    public boolean isValidMove(Position position) {

        if (position == null) {
            return false;
        }

        int row = position.getRow();
        int col = position.getCol();

        return row >= 0
                && row < rows
                && col >= 0
                && col < columns
                && grid[row][col] == Symbol.EMPTY;
    }

    public void makeMove(
            Position position,
            Symbol symbol
    ) {

        if (!isValidMove(position)) {
            throw new IllegalArgumentException(
                    "Invalid move"
            );
        }

        grid[position.getRow()]
                [position.getCol()] = symbol;
    }

    /*
     * Check whether a player has won.
     */
    public boolean hasWinner(Symbol symbol) {

        // Rows
        for (int row = 0; row < rows; row++) {

            boolean winner = true;

            for (int col = 0; col < columns; col++) {

                if (grid[row][col] != symbol) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return true;
            }
        }

        // Columns
        for (int col = 0; col < columns; col++) {

            boolean winner = true;

            for (int row = 0; row < rows; row++) {

                if (grid[row][col] != symbol) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return true;
            }
        }

        // Diagonals
        if (rows == columns) {

            // Main diagonal
            boolean winner = true;

            for (int i = 0; i < rows; i++) {

                if (grid[i][i] != symbol) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return true;
            }

            // Anti-diagonal
            winner = true;

            for (int i = 0; i < rows; i++) {

                if (grid[i][columns - 1 - i] != symbol) {
                    winner = false;
                    break;
                }
            }

            if (winner) {
                return true;
            }
        }

        return false;
    }

    /*
     * Check if board is completely filled.
     */
    public boolean isFull() {

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < columns; col++) {

                if (grid[row][col] == Symbol.EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    public void printBoard() {

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < columns; col++) {

                System.out.print(
                        " " + grid[row][col] + " "
                );

                if (col < columns - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (row < rows - 1) {
                System.out.println(
                        "---+---+---"
                );
            }
        }

        System.out.println();
    }
}


/* ============================================================
   STATE PATTERN
   ============================================================ */

interface GameState {

    boolean isGameOver();

    String getName();
}


/* ============================================================
   X TURN
   ============================================================ */

class XTurnState implements GameState {

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public String getName() {
        return "X_TURN";
    }
}


/* ============================================================
   O TURN
   ============================================================ */

class OTurnState implements GameState {

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public String getName() {
        return "O_TURN";
    }
}


/* ============================================================
   X WON
   ============================================================ */

class XWonState implements GameState {

    @Override
    public boolean isGameOver() {
        return true;
    }

    @Override
    public String getName() {
        return "X_WON";
    }
}


/* ============================================================
   O WON
   ============================================================ */

class OWonState implements GameState {

    @Override
    public boolean isGameOver() {
        return true;
    }

    @Override
    public String getName() {
        return "O_WON";
    }
}


/* ============================================================
   DRAW
   ============================================================ */

class DrawState implements GameState {

    @Override
    public boolean isGameOver() {
        return true;
    }

    @Override
    public String getName() {
        return "DRAW";
    }
}


/* ============================================================
   GAME CONTEXT
   ============================================================ */

class GameContext {

    private GameState currentState;

    public GameContext() {

        // X starts
        currentState = new XTurnState();
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void setState(GameState state) {
        currentState = state;
    }

    public boolean isGameOver() {
        return currentState.isGameOver();
    }
}


/* ============================================================
   FACTORY PATTERN
   ============================================================ */

interface PlayerFactory {

    Player createPlayer(
            Symbol symbol,
            PlayerStrategy strategy
    );
}


/* ============================================================
   CONCRETE FACTORY
   ============================================================ */

class SimplePlayerFactory
        implements PlayerFactory {

    @Override
    public Player createPlayer(
            Symbol symbol,
            PlayerStrategy strategy
    ) {

        return new Player(
                symbol,
                strategy
        );
    }
}


/* ============================================================
   TIC TAC TOE GAME
   ============================================================ */

class TicTacToeGame {

    private final Board board;

    private final List<Player> players;

    private final GameContext gameContext;

    private final List<GameEventListener> listeners;

    private int currentPlayerIndex;

    public TicTacToeGame(
            int rows,
            int columns,
            PlayerStrategy playerXStrategy,
            PlayerStrategy playerOStrategy,
            PlayerFactory playerFactory
    ) {

        this.board = new Board(rows, columns);

        this.players = new ArrayList<>();

        this.gameContext = new GameContext();

        this.listeners = new ArrayList<>();

        this.currentPlayerIndex = 0;

        players.add(
                playerFactory.createPlayer(
                        Symbol.X,
                        playerXStrategy
                )
        );

        players.add(
                playerFactory.createPlayer(
                        Symbol.O,
                        playerOStrategy
                )
        );
    }

    /*
     * Register observer.
     */
    public void addListener(
            GameEventListener listener
    ) {

        listeners.add(listener);
    }

    /*
     * Main game loop.
     */
    public void play() {

        while (!gameContext.isGameOver()) {

            board.printBoard();

            Player currentPlayer =
                    getCurrentPlayer();

            // Strategy Pattern
            Position position =
                    currentPlayer.makeMove(board);

            // Make move
            board.makeMove(
                    position,
                    currentPlayer.getSymbol()
            );

            // Observer Pattern
            notifyMoveMade(
                    position,
                    currentPlayer.getSymbol()
            );

            // Check game result
            updateGameState(currentPlayer);

            // Switch player only if game continues
            if (!gameContext.isGameOver()) {
                switchPlayer();
            }
        }

        board.printBoard();

        announceResult(
                gameContext.getCurrentState()
        );
    }

    private Player getCurrentPlayer() {

        return players.get(currentPlayerIndex);
    }

    /*
     * X -> O
     * O -> X
     */
    private void switchPlayer() {

        currentPlayerIndex =
                (currentPlayerIndex + 1)
                        % players.size();

        if (currentPlayerIndex == 0) {

            changeState(
                    new XTurnState()
            );

        } else {

            changeState(
                    new OTurnState()
            );
        }
    }

    /*
     * Determine:
     *
     * 1. X won
     * 2. O won
     * 3. Draw
     * 4. Continue
     */
    private void updateGameState(
            Player currentPlayer
    ) {

        Symbol symbol =
                currentPlayer.getSymbol();

        // Winner
        if (board.hasWinner(symbol)) {

            if (symbol == Symbol.X) {

                changeState(
                        new XWonState()
                );

            } else {

                changeState(
                        new OWonState()
                );
            }

            return;
        }

        // Draw
        if (board.isFull()) {

            changeState(
                    new DrawState()
            );
        }
    }

    /*
     * State transition + Observer notification.
     */
    private void changeState(
            GameState state
    ) {

        gameContext.setState(state);

        notifyGameStateChanged(state);
    }

    /*
     * Notify all observers about move.
     */
    private void notifyMoveMade(
            Position position,
            Symbol symbol
    ) {

        for (GameEventListener listener
                : listeners) {

            listener.onMoveMade(
                    position,
                    symbol
            );
        }
    }

    /*
     * Notify all observers about state.
     */
    private void notifyGameStateChanged(
            GameState state
    ) {

        for (GameEventListener listener
                : listeners) {

            listener.onGameStateChanged(
                    state
            );
        }
    }

    private void announceResult(
            GameState state
    ) {

        if (state instanceof XWonState) {

            System.out.println(
                    "Player X wins!"
            );

        } else if (state instanceof OWonState) {

            System.out.println(
                    "Player O wins!"
            );

        } else if (state instanceof DrawState) {

            System.out.println(
                    "Game Draw!"
            );
        }
    }
}