package org.example.LowLevelDesignSystemExample.DesignTicTacToe;

import java.util.List;

public class Board {
  public int size;

  public PlayingPiece[][]
      board; // The board is of size dimention and type PlayingPiece as it will only have the Piece.

  public Board(int size) {
    this.size = size;
    this.board = new PlayingPiece[size][size];
  }

  public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
    if (board[row][col] != null) {
      return false;
    }
    board[row][col] = playingPiece;
    return true;
  }

  public List<Pair<Integer, Integer>> getFreeCells() {
    List<Pair<Integer, Integer>> arr = null;
    return arr;
  }
}
