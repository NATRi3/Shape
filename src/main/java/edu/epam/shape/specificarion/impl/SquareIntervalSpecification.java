package edu.epam.shape.specificarion.impl;

import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.service.impl.CubeServiceImpl;
import edu.epam.shape.specificarion.Specification;

public class SquareIntervalSpecification implements Specification<Cube> {
    private final double from;
    private final double to;

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
