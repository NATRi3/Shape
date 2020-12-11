package edu.epam.shape.specificarion;

import edu.epam.shape.entity.Shape;

@FunctionalInterface
public interface Specification<T extends Shape> {
    boolean specify(T t);
}
