package edu.epam.shape.factory.impl;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.exception.CubeFactoryException;
import edu.epam.shape.factory.ShapeFactory;
import edu.epam.shape.validation.CubeValidator;

public class CubeFactory extends ShapeFactory {

    @Override
    public Cube createShape(double side, Point point) throws CubeFactoryException {
        if(!CubeValidator.isCubeValid(side,point)){
            throw new CubeFactoryException("Cube is invalid");
        }
        return new Cube(side,point);
    }
}
