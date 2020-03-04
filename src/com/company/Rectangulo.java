package com.company;

public class Rectangulo extends Figura {
    private double a;
    private double b;
    public Rectangulo(double a, double b)
    {
        this.a = a; this.b =b;
    }
    public double Area()
    {
        return this.a*this.b;
    }
}
