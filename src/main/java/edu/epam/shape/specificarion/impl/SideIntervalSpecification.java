package edu.epam.shape.specificarion.impl;

import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.service.impl.CubeServiceImpl;
import edu.epam.shape.specificarion.Specification;

public class SideIntervalSpecification implements Specification<Cube> {
    private final double from;
    private final double to;

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
