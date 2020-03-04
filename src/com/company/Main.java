package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Figura[] v = new Figura[4];
        v[0] = new Circulo(7.5);
        v[1] = new Rectangulo(5,3);
        v[2] = new Triangulo(7,2);
        v[3] = new Quadrado(7.8);
        System.out.println("The Total Area is " + Suma(v));
        Arrays.sort(v); //Implemented Sorting inside the Class Figura
        double area_total = Suma(v);
        for (Figura i : v) {
            System.out.println("The Total Area is " + i.Area());
        }

    }
    public static double Suma(Figura[] figuras){
        double area_total = 0;
        for (Figura i : figuras) {
            area_total = area_total + i.Area();
        }
        return area_total;
    }

}
