package edu.epam.shape.service;

import edu.epam.shape.entity.Shape;
import edu.epam.shape.entity.Cube;
import edu.epam.shape.exception.ServiceException;

public interface CubeService {
    double squareCalculator(Cube cube);
    double surfaceCalculator(Cube cube);
    boolean isCube(Shape shape);
    boolean isCubeSideOnCoordinate(Cube cube);
    double squareRatiosSection(Cube cube) throws ServiceException;
}
