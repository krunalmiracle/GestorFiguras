package com.company;

public class Circulo extends Figura {
    private double r;
    private static double  pi = 3.14;
    public Circulo(double radius)
    {
        this.r = radius;
    }
    public double area()
    {
        return pi*(r*r);
    }
}
