package edu.epam.shape.util;

import edu.epam.shape.entity.impl.Cube;

import java.util.Comparator;

public enum CubeComparator implements Comparator<Cube> {
    POINT_X{
        @Override
        public int compare(Cube o1, Cube o2) {
            return Double.compare(o1.getPoint().getX(),o2.getPoint().getX());
        }
    },
    POINT_Y{
        @Override
        public int compare(Cube o1, Cube o2) {
            return Double.compare(o1.getPoint().getY(),o2.getPoint().getY());
        }
    },
    POINT_Z{
        @Override
        public int compare(Cube o1, Cube o2) {
            return Double.compare(o1.getPoint().getZ(),o2.getPoint().getZ());
        }
    },
    SIDE{
        @Override
        public int compare(Cube o1, Cube o2) {
            return Double.compare(o1.getSide(),o2.getSide());
        }
    }
}
