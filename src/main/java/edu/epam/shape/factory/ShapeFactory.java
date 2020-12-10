package edu.epam.shape.factory;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.Shape;
import edu.epam.shape.exception.CubeFactoryException;

public abstract class ShapeFactory {
    public abstract Shape createShape(double side, Point point) throws CubeFactoryException;
}
