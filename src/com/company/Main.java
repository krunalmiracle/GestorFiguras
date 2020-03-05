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

        //Arrays.sort(v); //Implemented Sorting inside the Class GestorFigura, Last Version Main Test Array.Sort
        GestorFiguras gestorfiguras = new GestorFiguras();
         gestorfiguras.Sort(v);
        double area_total = gestorfiguras.Suma(v);
        System.out.println("The Total Area is " +area_total);// GOD FORBID THIS SHOULDN'T BE ACTIVATED!!

    }


}
