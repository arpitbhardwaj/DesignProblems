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
        return false;
    }
}
