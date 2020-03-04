package com.company;

public class Triangulo extends Figura {
    private double height;
    private double base;
    public Triangulo(double h, double b)
    {
        this.height = h; this.base =b;
    }
    public double Area()
    {
        return this.height*this.base/2;
    }
}
