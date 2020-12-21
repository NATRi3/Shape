package edu.epam.shape.specificarion.impl;

import edu.epam.shape.entity.Cube;
import edu.epam.shape.service.impl.CubeServiceImpl;
import edu.epam.shape.specificarion.Specification;

public class SurfaceSquareIntervalSpecification implements Specification<Cube> {
    private double from;
    private double to;

    public SurfaceSquareIntervalSpecification(double from, double to){
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Cube cube) {
        double surfSqrCube = new CubeServiceImpl().surfaceCalculator(cube);
        return surfSqrCube>=from && surfSqrCube<=to;
    }
}
