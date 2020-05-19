package com.ab.design.snakegame;

import javax.sound.midi.Soundbank;

/**
 * @author Arpit Bhardwaj
 *
 * • Snake can move in a given direction and when it eats the food, the length of snake increases.
 * • When snake crosses itself, the game will over.
 * • Food will be generated at given interval.
 */
public class SnakeGame {
    private Snake snake;
    private Board board;
    private Direction direction;
    private boolean gameOver;

    public SnakeGame(Snake snake, Board board) {
        this.snake = snake;
        this.board = board;
    }

    public static void main(String[] args) {
        System.out.println("Starting game...");
        Cell initPos = new Cell(0,0);
        Snake snake = new Snake(initPos);
        Board board = new Board(10,10);
        SnakeGame game = new SnakeGame(snake,board);

        game.gameOver = false;

    }
}
