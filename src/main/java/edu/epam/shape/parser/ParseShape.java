package edu.epam.shape.parser;

import edu.epam.shape.entity.Shape;
import edu.epam.shape.exception.CubeFactoryException;

import java.util.List;
import java.util.Map;

public interface ParseShape<T,K> {
    Map<T,K> parse(List<String> list) throws CubeFactoryException;
}
