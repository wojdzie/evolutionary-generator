package com.wojdzie.evolutionary.generator.model;

import java.util.List;
import java.util.Random;

public class Animal {

    private Turn turn;
    private int energy;
    private List<Integer> genes;

    public Animal() {
        turn = Turn.getRandomTurn();
    }


}
