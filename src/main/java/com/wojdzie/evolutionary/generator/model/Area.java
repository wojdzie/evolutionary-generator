package com.wojdzie.evolutionary.generator.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Area {

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    abstract boolean isJungle();

    void removeDeadAnimals() {
        animals.removeIf(Animal::isDead);
    }
}
