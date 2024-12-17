Design TicTackToe.

Object.

Pieces - X, O, $, #.

Pieces should be extensible. Number of players is equal to number of pieces.

Board - nXm.

Player.

```java
public enum PieceType{
    X,O; // Can be anything.
}

public class PlayingPiece{
    public PieceType pieceType;
    PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
        // It will be dynamically called by the child class.
    }
}

public class PlayingPieceX extends PlayingPiece{
    public PlayingPiece(){
        super(PieceType.X);
    }
}

public class PlayingPieceO extends PlayingPiece{
    public PlayingPiece(){
        super(PieceType.O);
    }
}

public class Board{
    public int size;

    public PlayingPiece[][] board; // The board is of size dimention and type PlayingPiece as it will only have the Piece.

    public Board(int size){
        this.size=size;
        this.board=new PlayingPiece[size][size];
    }
    public boolean addPiece(int row, int col,PlayingPiece playingPiece){
        if(board[row][col]!=null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells(){

    }
}

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

public class GameClass{
    List<Player> player;
    Board board;

    GameClass(){
        initilizeGame();
    }

    public void initializeGame(){
        player = new ArrayList<>();
        PlayingPieceX crossPlayer = new PlayingPieceX();
        Player player1 = new Player("Player1",crossPiece);

        PlayingPiece0 noughtsPiece = new playingPiece0();
        Player player2 = new player("Player2",noughtsPiece);

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }
    public String startGame(){
        boolean noWinner = true;
        int counter = 0;

        while(noWinner){
            Player playerTurn;
            board.printBoard();

            List<Pair<Integer, Integer>> freeSpace = board.getFreeCells();
            if(freeSpace.isEmpty()){
                noWinner = false;
                continue;
            }
            if(counter%2==0){
                playerTurn = player1;
            }
            else{
                playerTurn = player2;
            }

            System.out.println("Player " + playerTurn.name + "Enter row and col ");
            Scanner inputScn = new Scanner(System.in);
            int row = inputScn.nextInt();
            int col = inputScn.nextInt();

            boolean pieceAddedSuccessfully = board.addPiece(row,col,playerTurn.playingPiece);

            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position");
                continue;
            }

            boolean winner = isWinner(row,col,playerTurn.playingPiece.pieceType);
            if(winner){
                return playerTurn.name;
            }
            counter++;
        }
        return "Tie";
    }



    public boolean isWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean disgonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i<board.size;i++){
            if(board.board[row][i]==null || board.board[row][i] != pieceType){
                rowMatch = false;
            }
        }

        // see the column.
        for(int i=0;i<board.size;i++){
            if(board.board[i][j]==null || board.board[i][col].pieceType != pieceType){
                colMatch = false;
            }
        }

        // see the diagonal.
        for(int i=0,j=0;i<board.size;i++,j++){
            if(board.board[i][j]==null || board.board[i][j].piecetype!=pieceType){
                diagonalMatch = false;
            }
        }

        // see the anti diagonals.
        for(int i=0,j=board.size-1;i<board.size;i++,j--){
            if(board..board[i][j]==null || board.board[i][j].pieceType!=pieceType){
                antiDiagonal = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
public class Main{
    public static void main(String args[]){
        GameClass game = new GameClass();
        System.out.println("Game winner is " + game.startGame());
    }
}
```