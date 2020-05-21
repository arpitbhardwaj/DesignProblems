package com.ab.design.chessgame;

/**
 * @author Arpit Bhardwaj
 */
public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;

    public Move(Player player, Spot start, Spot end) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }
}
