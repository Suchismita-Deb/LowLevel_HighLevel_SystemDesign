package org.example.LowLevelDesignSystemExample.DesignTicTacToe;

public class PlayingPiece {

    public PieceType pieceType;

    PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
        // It will be dynamically called by the child class.
    }
}




