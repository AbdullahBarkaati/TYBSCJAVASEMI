package com.example.demo;

interface Operation {
    final double PI = 3.142;
    void calculateArea();
    void calculateVolume();
}

class Cylinder implements Operation {
    int radius;
    int height;
    Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area = "+ (2*PI*radius*height));
    }

    public void  calculateVolume() {
        System.out.println("Volume = "+ (PI*radius*radius*height));
    }
}

class SetAQ3 {

    public static void main(String[] args) {

        Cylinder c = new Cylinder(3, 5);
        c.calculateArea();
        c.calculateVolume();

    }
}