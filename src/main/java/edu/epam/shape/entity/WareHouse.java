package edu.epam.shape.entity;

import java.util.HashMap;
import java.util.Map;

public class WareHouse {
    public final static WareHouse INSTANCE = new WareHouse();
    private final Map<String, ShapeParameter> map;

    private WareHouse(){
        map = new HashMap<>();
    }

    public Map<String,ShapeParameter> getMap(){
        return new HashMap<>(map);
    }

    public ShapeParameter getByName(String name){
        return map.get(name);
    }

    public void put(String name, ShapeParameter shapeParameter){
        map.put(name,shapeParameter);
    }

    public void remove(String name){
        map.remove(name);
    }
}
