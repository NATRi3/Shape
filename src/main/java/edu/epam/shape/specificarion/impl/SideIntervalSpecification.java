package edu.epam.shape.specificarion.impl;

import edu.epam.shape.entity.Cube;
import edu.epam.shape.specificarion.Specification;

public class SideIntervalSpecification implements Specification<Cube> {
    private double from;
    private double to;

    public SideIntervalSpecification(double from, double to){
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Cube cube) {
        double side = cube.getSide();
        return side>=from && side<=to;
    }
}
