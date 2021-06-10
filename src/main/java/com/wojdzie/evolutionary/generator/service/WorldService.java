package com.wojdzie.evolutionary.generator.service;

import com.wojdzie.evolutionary.generator.model.Area;
import com.wojdzie.evolutionary.generator.model.World;
import java.awt.*;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldService {

    private static final Logger LOGGER = LogManager.getLogger(WorldService.class);

    public void removeDeadAnimals(World world) {
        Map<Point, Area> map = world.getMap();
        for (Map.Entry<Point, Area> entry : map.entrySet()) {
            Area area = entry.getValue();
            area.removeDeadAnimals();
        }
    }
}
