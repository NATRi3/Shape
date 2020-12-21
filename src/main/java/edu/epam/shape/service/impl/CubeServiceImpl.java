package edu.epam.shape.service.impl;

import edu.epam.shape.entity.Shape;
import edu.epam.shape.entity.Cube;
import edu.epam.shape.exception.ServiceException;
import edu.epam.shape.service.CubeService;
import edu.epam.shape.validation.CubeValidator;

public class CubeServiceImpl implements CubeService {
    private static final int NUMBER_SIDE = 6;

    @Override
    public double squareCalculator(Cube cube) {
        return cube.getSide()*cube.getSide()*cube.getSide();
    }

    @Override
    public double surfaceCalculator(Cube cube) {
        return (cube.getSide()*cube.getSide())* NUMBER_SIDE;
    }

    @Override
    public boolean isCube(Shape shape) {
        boolean result = true;
        if(!shape.getClass().equals(Cube.class)){
            result = false;
        }else{
            Cube cube = (Cube) shape;
            if (!CubeValidator.isCubeValid(cube.getSide(),cube.getPoint())){
                result = false;
            }
        }
        return result;
    }

    @Override
    public boolean isCubeSideOnCoordinate(Cube cube) {
        double y = cube.getPoint().getY()+cube.getSide();
        double x = cube.getPoint().getX()+cube.getSide();
        double z = cube.getPoint().getZ()+cube.getSide();
        return y==0||x==0||z==0||cube.getPoint().getX()==0||
                cube.getPoint().getY()==0||cube.getPoint().getZ()==0;
    }

    @Override
    public double squareRatiosSection(Cube cube) throws ServiceException {
        double result;
        double y = cube.getPoint().getY()+cube.getSide();
        double x = cube.getPoint().getX()+cube.getSide();
        double z = cube.getPoint().getZ()+cube.getSide();
        if (y>0&&cube.getPoint().getY()<0){
            result = ( cube.getPoint().getY() * cube.getSide() * cube.getSide() )
                    / ( y * cube.getSide() * cube.getSide());
        }else {
            if (x > 0 && cube.getPoint().getX() < 0) {
                result = (cube.getPoint().getX() * cube.getSide() * cube.getSide())
                        / (x * cube.getSide() * cube.getSide());
            } else {
                if (z > 0 && cube.getPoint().getZ() < 0) {
                    result = (cube.getPoint().getZ() * cube.getSide() * cube.getSide())
                            / (z * cube.getSide() * cube.getSide());
                }else {
                    throw new ServiceException("squareRationSection not found");
                }
            }
        }
        return Math.abs(result);
    }
}
