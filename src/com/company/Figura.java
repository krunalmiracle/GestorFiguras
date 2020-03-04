package com.company;

abstract class Figura implements Comparable< Figura >{
    public abstract double Area();
    @Override
    public int compareTo(Figura b) {
        if (this.Area() > b.Area())
            return 1;
        else if (this.Area() < b.Area())
            return -1;
        else
            return 0;
    }
}
