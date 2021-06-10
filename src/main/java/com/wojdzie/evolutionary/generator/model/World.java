package com.wojdzie.evolutionary.generator.model;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class World {

    private Map<Point, Area> map = new HashMap<>();

    public Map<Point, Area> getMap() {
        return map;
    }
}
