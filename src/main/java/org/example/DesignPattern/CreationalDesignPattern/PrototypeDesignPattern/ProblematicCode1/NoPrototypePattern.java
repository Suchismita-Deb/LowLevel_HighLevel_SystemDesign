package org.example.DesignPattern.CreationalDesignPattern.PrototypeDesignPattern.ProblematicCode1;

import java.util.ArrayList;
import java.util.List;

public class NoPrototypePattern {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Blue", 2));
        gameBoard.addPiece(new GamePiece("Green", 3));
        gameBoard.showBoardState();

        // The game requirement is to set the gameBoardState in the place and new change will go to the gameBoard and the GameBoardState will be the copy of the board in the current position.

        GameBoard copyBoard = new GameBoard();


        // The copy of the entire board and place in copiedBoard. The bigger the game and the need to take the copy will make the application issue.

        // It should not be on client to create the copy.
    }
}

class GamePiece {
    private String color;
    private int position;

    public GamePiece(String color, int position) {
        this.color = color;
        this.position = position;
    }
    // When the variable set to private the getter and setter methods are needed.

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

class GameBoard {
    private List<GamePiece> gamePieces = new ArrayList<GamePiece>();

    public void addPiece(GamePiece gamePiece) {
        gamePieces.add(gamePiece);
    }

    public void showBoardState() {
        for (GamePiece gamePiece : gamePieces) {
            System.out.println("GamePiece color: " + gamePiece.getColor() + ", position: " + gamePiece.getPosition());
        }
    }
}