package edu.epam.shape.service.impl;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.Cube;
import edu.epam.shape.exception.ServiceException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CubeServiceImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testSquareCalculator() {
        Cube cube = new Cube(2.0, new Point(0,1,1));
        Assert.assertEquals(new CubeServiceImpl().squareCalculator(cube),8);
    }

    @Test
    public void testSurfaceCalculator() {
        Cube cube = new Cube(2.0, new Point(0,1,1));
        Assert.assertEquals(new CubeServiceImpl().surfaceCalculator(cube),24);
    }

    @Test
    public void testIsCubeSideOnCoordinate() {
        Cube cube = new Cube(2.0, new Point(0,1,1));
        Assert.assertTrue(new CubeServiceImpl().isCubeSideOnCoordinate(cube));
    }

    @Test
    public void testSquareRatiosSection() throws ServiceException {
        Cube cube = new Cube(2.0, new Point(-1,1,1));
        Assert.assertEquals(new CubeServiceImpl().squareRatiosSection(cube),1);
    }
}