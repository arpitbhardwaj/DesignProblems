package com.ab.design.games.tictactoe;

public class TicTacToe {
    int n;
    private final int[][] board;

    public TicTacToe(final int n) {
        this.n = n;
        this.board = new int[n][n];
    }

    /**
     *
     * @param player either 0 and 1
     * @param row
     * @param col
     * @return win -1 if first player, 1 if second player, 0 otherwise
     * @throws IllegalArgumentException
     */
    public int move(int player, int row, int col) throws IllegalArgumentException{
        if (row < 0 || col < 0 || row >=n || col >= n){
            throw new IllegalArgumentException("Move out of board");
        }else if(board[row][col] != 0){
            throw  new IllegalArgumentException("Spot is already occupied");
        }else if (player != 0 && player != 1){
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

    public static void main(String[] args) {
        TicTacToe toe = new TicTacToe(3);
        //1st player represented by 0 mark -1
        //2nd player represented by 1 mark 1;
        System.out.println(toe.move(0, 0, 0)); // Returns 0 (no one wins)
        System.out.println(toe.move(1, 0, 2)); // Returns 0 (no one wins)
        System.out.println(toe.move(0, 2, 2)); // Returns 0 (no one wins)
        System.out.println(toe.move(1, 1, 1)); // Returns 0 (no one wins)
        System.out.println(toe.move(0, 2, 0)); // Returns 0 (no one wins)
        System.out.println(toe.move(1, 1, 0)); // Returns 0 (no one wins)
        System.out.println(toe.move(0, 2, 1)); // Returns 1 (1st player won)
    }
}