package edu.epam.shape.service.impl;

import edu.epam.shape.entity.Shape;
import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.exception.ServiceException;
import edu.epam.shape.service.CubeService;

public class CubeServiceImpl implements CubeService {
    public static final int SIDE_SUM = 6;

    @Override
    public double squareCalculator(Cube cube) {
        return cube.getSide()*cube.getSide()*cube.getSide();
    }

    @Override
    public double surfaceCalculator(Cube cube) {
        return (cube.getSide()*cube.getSide())*SIDE_SUM;
    }

    @Override
    public boolean isCube(Shape shape) {
        return shape.getClass().equals(Cube.class);
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
