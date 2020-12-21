package edu.epam.shape.repository.impl;

import edu.epam.shape.entity.Cube;
import edu.epam.shape.repository.Repository;
import edu.epam.shape.specificarion.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CubeRepository implements Repository<Cube, Integer> {
    public static final CubeRepository INSTANCE = new CubeRepository();
    private final List<Cube> cubeList;

    private CubeRepository(){
        cubeList = new ArrayList<>();
    }
    @Override
    public void add(Cube cube) {
        cubeList.add(cube);
    }

    @Override
    public void remove(Cube cube) {
        cubeList.remove(cube);
    }

    @Override
    public Cube get(Integer index) {
        return cubeList.get(index);
    }

    @Override
    public List<Cube> sort(Comparator<? super Cube> comparator) {
        return cubeList.stream().sorted(comparator).collect(Collectors.toList());
    }

    @Override
    public List<Cube> query(Specification specification) {
        return cubeList.stream().filter(specification::specify).collect(Collectors.toList());
    }
}
