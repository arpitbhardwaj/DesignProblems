package com.ab.design.games.chessgame;

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
