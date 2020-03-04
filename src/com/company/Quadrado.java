package com.company;

public class Quadrado extends Figura {
    private double length ;
    public Quadrado(double l) {
        this.length = l;
    }

    @Override
    public double Area() {
        Rectangulo rectangulo = new Rectangulo(length,length);
        return rectangulo.Area();
    }
}

