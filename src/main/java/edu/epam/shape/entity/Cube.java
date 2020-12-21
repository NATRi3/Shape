package edu.epam.shape.entity;

import edu.epam.shape.observer.impl.CubeObserver;
import edu.epam.shape.util.StringNameCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Cube implements Shape<CubeObserver> {
    private String name;
    private Point point;
    private double side;
    private static final List<CubeObserver> OBSERVER_LIST = new ArrayList<>();

    public Cube(String name,double side, Point point) {
        this.name = name;
        this.point = point;
        this.side = side;
    }

    public Cube(double side, Point point) {
        name = StringNameCreator.createName();
        this.point = point;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.notifyObserver();
        this.side = side;
    }

    @Override
    public void attach(CubeObserver observer) {
        OBSERVER_LIST.add(observer);
    }

    @Override
    public void detach(CubeObserver observer) {
        OBSERVER_LIST.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if(!OBSERVER_LIST.isEmpty()){
            for(CubeObserver observer: OBSERVER_LIST){
                observer.performedSurfaceSquare(this);
                observer.performedSquare(this);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.side, side) == 0 && point.equals(cube.point);
    }

    @Override
    public int hashCode() {
        int hash = 31;
        return (int) (point.hashCode()*(side)/hash)*name.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("name='").append(name).append('\'');
        sb.append(", point=").append(point);
        sb.append(", side=").append(side);
        sb.append('}');
        return sb.toString();
    }
}
