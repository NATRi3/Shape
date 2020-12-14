package edu.epam.shape.parser.impl;

import edu.epam.shape.entity.Point;
import edu.epam.shape.entity.impl.Cube;
import edu.epam.shape.exception.CubeFactoryException;
import edu.epam.shape.factory.impl.CubeFactory;
import edu.epam.shape.parser.ParseShape;
import edu.epam.shape.validation.CubeValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CubeParse implements ParseShape<Cube> {
    private static final Logger LOGGER = LogManager.getLogger(CubeParse.class);
    private static final String REGEX = ", ";
    private static final CubeFactory CUBE_FACTORY = new CubeFactory();

    @Override
    public List<Cube> parse(List<String> list) {
        List<Cube> result = new ArrayList<>();
        for(String str: list) {
            String[] arguments = str.split(REGEX);
            try {
                result.add(CUBE_FACTORY.createShape(Double.parseDouble(arguments[0]),
                        new Point(Double.parseDouble(arguments[1]), Double.parseDouble(arguments[2]), Double.parseDouble(arguments[3]))));
            } catch (NumberFormatException | CubeFactoryException fe) {
                String msg = String.valueOf(new StringBuilder((Arrays.toString(arguments))).append("Wrong argument").append(fe.getMessage()));
                LOGGER.info(msg, fe);
            }
        }
        return result;
    }
}
