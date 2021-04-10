package com.wojdzie.evolutionary.generator.model;

import java.util.ArrayList;
import java.util.List;

public class SteppeArea implements Area {

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    @Override
    public boolean isJungle() {
        return false;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
