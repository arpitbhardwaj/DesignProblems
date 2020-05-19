package com.ab.design.chessgame;


/**
 * @author Arpit Bhardwaj
 */
public class Board {
    private Spot[][] board;

    public Board() {
        //initialize white pieces
        board[0][3] = new Spot(0, 1, new King(true));
        board[0][4] = new Spot(0, 2, new Queen(true));
        //...
        board[1][0] = new Spot(1, 0, new Pawn(true));
        board[1][1] = new Spot(1, 1, new Pawn(true));
    }
}
