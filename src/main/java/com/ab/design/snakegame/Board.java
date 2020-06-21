package com.ab.design.snakegame;

/**
 * @author Arpit Bhardwaj
 */
public class Board {
    final int rowCount,colCount;
    private Cell[][] board;

    public Board(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;

        board = new Cell[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                board[i][j] = new Cell(i,j);
            }
        }
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public void generateFood(){
        System.out.println("Generating Food...");
        int x = (int) (Math.random() * rowCount);
        int y = (int) (Math.random() * colCount);
        board[x][y].setType(CellType.FOOD);
        System.out.println("Food Generated at : " + x + " " + y);
    }
}
