package com.ab.design.games.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public class ChessGame {

    private Player[] players;
    private Board board;
    private Player currTurn;
    //private GameStatus status;


    public ChessGame(Player p1, Player p2) {
        players[0] = p1;
        players[0] = p2;
        board = new Board();
        if (p1.isWhiteSide()){
            this.currTurn = p1;
        }else{
            this.currTurn = p2;
        }
    }

    public boolean playerMove(Player p, int startX, int endX, int startY, int endY){
        Spot start = board.getBoard()[startX][endX];
        Spot end = board.getBoard()[startY][endY];
        Piece sourcePiece = start.getPiece();
        boolean canMove = sourcePiece.canMove(board,start,end);

        if (canMove){
            Piece destPiece = end.getPiece();
            if (destPiece != null){
                destPiece.setKilled(true);
            }else{
                end.setPiece(sourcePiece);
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
