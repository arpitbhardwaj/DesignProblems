package com.ab.design.snakegame;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class Snake {
    private List<Cell> snakeList;
    private Cell snakeHead;

    public Snake(Cell initPos) {
        this.snakeList = new LinkedList<>();
        this.snakeHead = initPos;
        this.snakeList.add(initPos);
    }

    public void grow(){
        snakeList.add(snakeHead);
    }

    public void move(Cell nextCell){
        System.out.println("Snake is moving to : " + nextCell.getX() + " " + nextCell.getY());
        Cell tail = snakeList.remove(snakeList.size());
        tail.setType(CellType.EMPTY);
        snakeHead = nextCell;
        snakeList.add(snakeHead);
    }
    public boolean checkCrash(Cell nextCell){
        System.out.println("Checking Crash...");
        for (Cell cell:
             snakeList) {
            if (cell == nextCell){
                return true;
            }
        }
        return false;
    }

    public List<Cell> getSnakeList() {
        return snakeList;
    }

    public void setSnakeList(List<Cell> snakeList) {
        this.snakeList = snakeList;
    }

    public Cell getSnakeHead() {
        return snakeHead;
    }

    public void setSnakeHead(Cell snakeHead) {
        this.snakeHead = snakeHead;
    }
}
