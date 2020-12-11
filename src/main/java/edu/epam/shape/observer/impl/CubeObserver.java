package edu.epam.shape.observer.impl;

import edu.epam.shape.entity.WareHouse;
import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.entity.impl.ShapeParameter;
import edu.epam.shape.observer.Observer;
import edu.epam.shape.service.impl.CubeServiceImpl;

public class CubeObserver implements Observer<Cube> {

    @Override
    public void performedSurfaceSquare(Cube cube) {
        CubeServiceImpl cubeService = new CubeServiceImpl();
        ShapeParameter wareHouseShapeParameter = WareHouse.INSTANCE.getByName(cube.getName());
        double surfSqr = cubeService.surfaceCalculator(cube);
        if (wareHouseShapeParameter != null) {
            wareHouseShapeParameter.setSurfaceSqr(surfSqr);
        } else {
            WareHouse.INSTANCE.put(cube.getName(), new ShapeParameter(surfSqr, -1));
        }
    }

    @Override
    public void performedSquare(Cube cube) {
        CubeServiceImpl cubeService = new CubeServiceImpl();
        ShapeParameter wareHouseShapeParameter = WareHouse.INSTANCE.getByName(cube.getName());
        double sqr = cubeService.squareCalculator(cube);
        if (wareHouseShapeParameter != null) {
            wareHouseShapeParameter.setSurfaceSqr(sqr);
        } else {
            WareHouse.INSTANCE.put(cube.getName(), new ShapeParameter(-1, sqr));
        }
    }
}
