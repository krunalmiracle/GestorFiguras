package com.company;

import java.util.Arrays;

public class GestorFiguras {

    private Figura[] _figuras;
    private double _area_total=0;
    public GestorFiguras(Figura[] figuras){
        this._figuras = figuras;
    }
    // Constructor with parameter
    public GestorFiguras(){
    }
    public double Suma(Figura[] figuras){
        double area_total = 0;
        for (Figura i : figuras) {
            area_total = area_total + i.Area();
        }
        this._area_total = area_total; //Storing Total Area
        return area_total;
    }
    public Figura[] Sort(Figura[] figuras)
    {
        Arrays.sort(figuras); //Implemented Sorting inside the Class Figura
        this._figuras = figuras; //Storing Sorted Figures
        return figuras;
    }
}
