package edu.epam.shape.observer;

import edu.epam.shape.entity.impl.Cube;

public interface Observer<T extends Cube> {
    void performedSurfaceSquare(T t);
    void performedSquare(T t);
}
