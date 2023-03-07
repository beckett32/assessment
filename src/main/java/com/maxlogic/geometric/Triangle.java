package com.maxlogic.geometric;

public class Triangle implements GeometricShape{
    private float side_a =0;
    private float side_b =0;
    private float side_c =0;

    public Triangle(float side_a, float side_b, float side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public float getSide_a() {
        return side_a;
    }

    public void setSide_a(float side_a) {
        this.side_a = side_a;
    }

    public float getSide_b() {
        return side_b;
    }

    public void setSide_b(float side_b) {
        this.side_b = side_b;
    }

    public float getSide_c() {
        return side_c;
    }

    public void setSide_c(float side_c) {
        this.side_c = side_c;
    }

    @Override
    public double area() {
        // Heron formulae
        float s  = (side_a+side_b+side_c)/2f;
        double area = Math.sqrt(s* (s-side_a)*(s-side_b)*(s-side_c));
        return area;
    }

    @Override
    public double perimeter() {
        return side_a+side_b+side_c;
    }
}
