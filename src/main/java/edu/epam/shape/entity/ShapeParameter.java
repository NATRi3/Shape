package edu.epam.shape.entity;

public class ShapeParameter {
    private double surfaceSquare;
    private double volume;

    public ShapeParameter(double surfaceSquare, double volume) {
        this.surfaceSquare = surfaceSquare;
        this.volume = volume;
    }

    public double getSurfaceSquare() {
        return surfaceSquare;
    }

    public void setSurfaceSquare(double surfaceSquare) {
        this.surfaceSquare = surfaceSquare;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
