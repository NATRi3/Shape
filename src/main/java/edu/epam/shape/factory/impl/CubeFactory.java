package edu.epam.shape.factory.impl;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.Shape;
import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.exception.CubeFactoryException;
import edu.epam.shape.factory.ShapeFactory;

public class CubeFactory extends ShapeFactory {

    @Override
    public Cube createShape(double side, Point point) throws CubeFactoryException {
        if(side<=0){
            throw new CubeFactoryException("Illegal argument");
        }
        return new Cube(side,point);
    }
}
