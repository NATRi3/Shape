package edu.epam.shape.parser.impl;

import edu.epam.shape.entity.Point;
import edu.epam.shape.parser.ParseShape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CubeParse implements ParseShape<Point,Double> {
    private static final Logger LOGGER = LogManager.getLogger(CubeParse.class);
    private static final String REGEX = ", ";

    @Override
    public Map<Point,Double> parse(List<String> data) {
        Map<Point,Double> result = new HashMap<>();
        for(String argumentString: data) {
            String[] arguments = argumentString.split(REGEX);
            try {
                result.put(new Point(Double.parseDouble(arguments[0]),Double.parseDouble(arguments[1]),
                        Double.parseDouble(arguments[2])),Double.parseDouble(arguments[4]));
            } catch (NumberFormatException fe) {
                LOGGER.info(Arrays.toString(arguments) + "Wrong argument" + fe.getMessage(), fe);
            }
        }
        return result;
    }
}
