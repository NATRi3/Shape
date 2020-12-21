package edu.epam.shape.specificarion.impl;

import edu.epam.shape.entity.Cube;
import edu.epam.shape.service.impl.CubeServiceImpl;
import edu.epam.shape.specificarion.Specification;

public class SquareIntervalSpecification implements Specification<Cube> {
    private double from;
    private double to;

    public SquareIntervalSpecification(double from, double to){
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Cube cube) {
        double sqrCube = new CubeServiceImpl().squareCalculator(cube);
        return sqrCube>=from && sqrCube<=to;
    }
}
