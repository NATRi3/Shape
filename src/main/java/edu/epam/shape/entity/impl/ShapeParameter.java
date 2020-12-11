package edu.epam.shape.entity.impl;

public class ShapeParameter {
    private double surfaceSqr;
    private double sqr;

    public ShapeParameter(double surfaceSqr, double sqr) {
        this.surfaceSqr = surfaceSqr;
        this.sqr = sqr;
    }

    public double getSurfaceSqr() {
        return surfaceSqr;
    }

    public void setSurfaceSqr(double surfaceSqr) {
        this.surfaceSqr = surfaceSqr;
    }

    public double getSqr() {
        return sqr;
    }

    public void setSqr(double sqr) {
        this.sqr = sqr;
    }
}
