package edu.epam.shape.entity.impl;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.Shape;
import edu.epam.shape.util.StringNameCreator;

public class Cube implements Shape {
    private String name;
    private Point point;
    private double side;

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
        this.side = side;
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
        int hash = 89;
        return (int) (point.hashCode()*(side)/hash)*name.hashCode();
    }

}
