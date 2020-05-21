package com.ab.design.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public abstract class Player {
    private boolean whiteSide;
    private boolean bot;

    public boolean isWhiteSide() {
        return whiteSide;
    }

    public boolean isBot() {
        return bot;
    }
}
