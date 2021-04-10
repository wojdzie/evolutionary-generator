package com.wojdzie.evolutionary.generator.model;

public enum Turn {
    NO_TURN(0),
    DIAGONALLY_RIGHT(1),
    RIGHT(2),
    DIAGONALLY_BACK_RIGHT(3),
    BACK(4),
    DIAGONALLY_BACK_LEFT(5),
    LEFT(6),
    DIAGONALLY_LEFT(7);

    private final int turn;

    Turn(int turn) {
        if (!isTurnInRange(turn)) {
            throw new IndexOutOfBoundsException("Turn should be in range 0...7");
        }
       this.turn = turn;
    }

    private boolean isTurnInRange(int turn) {
        return turn >= 0 && turn <= 7;
    }

    public int getTurn() {
        return turn;
    }
}
