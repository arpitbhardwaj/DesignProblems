package com.ab.design.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public class Queen extends Piece{

    public Queen(boolean white) {
        super(white);
    }

    @Override
    protected boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
