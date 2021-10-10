package com.ab.design.games.TicTacToe;

public class Board {
    int n;
    private final int[][] board;

    public Board(final int n) {
        this.n = n;
        this.board = new int[n][n];
    }

    /**
     *
     * @param player either 0 and 1
     * @param row
     * @param col
     * @return win +1 if first player, -1if second player, 0 otherwise
     * @throws IllegalArgumentException
     */
    public int move(int player, int row, int col) throws IllegalArgumentException{
        if (row < 0 || col < 0 || row >=n || col >= n){
            throw new IllegalArgumentException("Move out of board");
        }else if(board[row][col] != 0){
            throw  new IllegalArgumentException("Spot is already occupied");
        }else if (player != 0 || player != 1){
            throw new IllegalArgumentException("Invalid Player");
        }else{
            player = player == 0 ? -1 : 1;
            board[row][col] = player;

            //row
            boolean win = true;
            for (int i = 0; i < n; i++) {
                if (board[row][i] != player){
                    win = false;
                    break;
                }
            }
            if (win){
                return player;
            }

            //column
            win = true;
            for (int i = 0; i < n; i++) {
                if (board[i][col] != player){
                    win = false;
                    break;
                }
            }
            if (win){
                return player;
            }
            //diagonal
            if (row == col){
                win = true;
                for (int i = 0; i < n; i++) {
                    if (board[i][i] != player){
                        win = false;
                        break;
                    }
                }
                if (win){
                    return player;
                }
            }

            //reverse diagonal
            if (row == n-1-col){
                win = true;
                for (int i = 0; i < n; i++) {
                    if (board[i][n-1-i] != player){
                        win = false;
                        break;
                    }
                }
                if (win){
                    return player;
                }
            }
        }
        return 0;
    }
}
