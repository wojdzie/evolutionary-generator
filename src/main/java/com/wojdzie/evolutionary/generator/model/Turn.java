package com.wojdzie.evolutionary.generator.model;

import java.util.Random;

public enum Turn {

    TOP(0),
    UPPER_RIGHT(1),
    RIGHT(2),
    BOTTOM_RIGHT(3),
    BOTTOM(4),
    BOTTOM_LEFT(5),
    LEFT(6),
    UPPER_LEFT(7);

    private final int value;

    Turn(int value) {
        this.value = value;
    }
    public static Turn getRandomTurn() {
        Random random = new Random();
        int value = random.nextInt(8);

        for (Turn turn : Turn.values()) {
            if (value == turn.getValue()) {
                return turn;
            }
        }

        return null;
    }

    public int getValue() {
        return value;
    }
}
