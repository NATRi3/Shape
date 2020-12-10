package edu.epam.shape.parser;

import edu.epam.shape.entity.Shape;
import edu.epam.shape.exception.CubeFactoryException;

import java.util.List;

public interface ParseShape<T extends Shape> {
    List<T> parse(List<String> list) throws CubeFactoryException;
}
