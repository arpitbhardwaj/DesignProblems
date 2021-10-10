package com.ab.design.games.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public class Board {
    private Spot[][] board;

    public Board() {
        initialize();
    }

    public void initialize(){
        //initialize white pieces
        board[0][3] = new Spot(0, 1, new King(true));
        board[0][4] = new Spot(0, 2, new Queen(true));

        //initialize black pieces
        board[7][3] = new Spot(0, 1, new King(false));
        board[7][4] = new Spot(0, 2, new Queen(false));

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Spot(i,j,null);
            }
        }
    }

    public Spot[][] getBoard() {
        return board;
    }
}
