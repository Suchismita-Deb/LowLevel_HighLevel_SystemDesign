//package org.example.LowLevelDesignSystemExample.DesignTicTacToe;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class GameClass{
//    List<Player> player;
//    Board board;
//
//    GameClass(){
//        initializeGame();
//    }
//
//    public void initializeGame(){
//        player = new ArrayList<>();
//        PlayingPieceX crossPlayer = new PlayingPieceX();
//        Player player1 = new Player("Player1",crossPiece);
//
//        PlayingPieceO noughtsPiece = new PlayingPieceO();
//        Player player2 = new Player("Player2",noughtsPiece);
//
//        player.add(player1);
//        player.add(player2);
//
//        board = new Board(3);
//    }
//    public String startGame(){
//        boolean noWinner = true;
//        int counter = 0;
//
//        while(noWinner){
//            Player playerTurn;
//            board.printBoard();
//
//            List<Pair<Integer, Integer>> freeSpace = board.getFreeCells();
//            if(freeSpace.isEmpty()){
//                noWinner = false;
//                continue;
//            }
//            if(counter%2==0){
//                playerTurn = player1;
//            }
//            else{
//                playerTurn = player2;
//            }
//
//            System.out.println("Player " + playerTurn.name + "Enter row and col ");
//            Scanner inputScn = new Scanner(System.in);
//            int row = inputScn.nextInt();
//            int col = inputScn.nextInt();
//
//            boolean pieceAddedSuccessfully = board.addPiece(row,col,playerTurn.playingPiece);
//
//            if(!pieceAddedSuccessfully){
//                System.out.println("Incorrect position");
//                continue;
//            }
//
//            boolean winner = isWinner(row,col,playerTurn.playingPiece.pieceType);
//            if(winner){
//                return playerTurn.name;
//            }
//            counter++;
//        }
//        return "Tie";
//    }
//
//
//
//    public boolean isWinner(int row, int col, PieceType pieceType){
//        boolean rowMatch = true;
//        boolean colMatch = true;
//        boolean diagonalMatch = true;
//        boolean antiDiagonalMatch = true;
//
//        for(int i=0;i<board.size;i++){
//            if(board.board[row][i]==null || board.board[row][i] != pieceType){
//                rowMatch = false;
//            }
//        }
//
//        // see the column.
//        for(int i=0;i<board.size;i++){
//            if(board.board[i][j]==null || board.board[i][col].pieceType != pieceType){
//                colMatch = false;
//            }
//        }
//
//        // see the diagonal.
//        for(int i=0,j=0;i<board.size;i++,j++){
//            if(board.board[i][j]==null || board.board[i][j].piecetype!=pieceType){
//                diagonalMatch = false;
//            }
//        }
//
//        // see the anti diagonals.
//        for(int i=0,j=board.size-1;i<board.size;i++,j--){
//            if(board.board[i][j]==null || board.board[i][j].pieceType!=pieceType){
//                antiDiagonalMatch = false;
//            }
//        }
//        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
//    }
//}
//
