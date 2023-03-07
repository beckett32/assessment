package com.maxlogic.geometric;

public class Circunference implements GeometricShape{
    private final double pi = 3.141592653589793238462643383279502884197;
    private float ratio;

    public Circunference(float ratio) {
        this.ratio = ratio;
    }

    @Override
    public double area() {
        return pi*Math.pow(ratio,2);
    }

    @Override
    public double perimeter() {
        return 2*pi*ratio;
    }
}
