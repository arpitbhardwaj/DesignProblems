package com.ab.design.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    protected boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
