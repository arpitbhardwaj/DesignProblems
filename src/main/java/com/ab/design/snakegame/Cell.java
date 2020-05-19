package com.ab.design.snakegame;

/**
 * @author Arpit Bhardwaj
 */
public class Cell {
    private final int x,y;
    private CellType type;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }
}
