package com.ab.design.games.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public class King extends Piece{

    public King(boolean white) {
        super(white);
    }

    @Override
    protected boolean canMove(Board board, Spot start, Spot end) {
        if (end.getPiece().isWhite() == this.isWhite()){
            return false;
        }
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        //if x+y==1 && box is unoccupied return true
        //if x+y==2 && box is occupied by other player return true

        return false;
    }
}
