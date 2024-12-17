package org.example.LowLevelDesignSystemExample.DesignTicTacToe;

public class Player{
    public String userName;
    public PlayingPiece piece;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }

    // Getter and Setter.

    public String getName() {
        return userName;
    }
    public void setName(String userName){
        this.userName = userName;
    }
    public PlayingPiece getPlayingPiece(){
        return playingPiece;
    }
    public void setPlayingPiece(PlayingPiece playingPiece){
        this.playingPiece = playingPiece;
    }
}
