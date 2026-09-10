package org.example.DesignPattern.CreationalDesignPattern.PrototypeDesignPattern.BetterCode1;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {
    public static void main(String[] args) {
        GameBoard  gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Blue", 2));
        gameBoard.addPiece(new GamePiece("Green", 3));
        gameBoard.showBoardState();
    }
}

interface PrototypeInterface<T>{
    T clone();
}

class GamePiece implements PrototypeInterface<GamePiece>{
    @Override
    public GamePiece clone() {
        return new GamePiece(this.color,this.position);
    }

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


class GameBoard implements PrototypeInterface<GameBoard>{


    private List<GamePiece> gamePieces = new ArrayList<>();

    public void addPiece(GamePiece gamePiece) {
        gamePieces.add(gamePiece);
    }

    public void showBoardState() {
        for (GamePiece gamePiece : gamePieces) {
            System.out.println("GamePiece color: " + gamePiece.getColor() + ", position: " + gamePiece.getPosition());
        }
    }
    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for (GamePiece gamePiece : gamePieces) {
            newBoard.addPiece(gamePiece.clone());
            // The main part is clone method in the direct we make a new GamePiece clone of the copy then it will be shallow copy and any change on the playing board will change copy. The pattern put the deep copy.
        }
        return newBoard;
    }

}

