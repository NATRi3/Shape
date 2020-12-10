package edu.epam.shape.reader;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.exception.DataReaderException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    @Test
    public void testReadShopFromFile() throws DataReaderException {
        List actual = new DataReader().readShopFromFile("src//test//resources//data.txt");
        List expected = new ArrayList<Cube>();
        expected.add(new Cube(1.0, new Point(2.0, 3.0, 4.0)));
        expected.add(new Cube(10.32, new Point(21.32, 32.5, -23.3)));
        Assert.assertEquals(actual,expected);
    }
}