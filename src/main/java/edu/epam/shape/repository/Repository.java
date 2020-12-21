package edu.epam.shape.repository;

import edu.epam.shape.entity.Shape;
import edu.epam.shape.specificarion.Specification;

import java.util.Comparator;
import java.util.List;

public interface Repository<T extends Shape, I> {
    void add(T t);
    void remove(T t);
    T get(I i);
    List<T> sort (Comparator<? super T> comparator);
    List<T> query (Specification specification);
}
