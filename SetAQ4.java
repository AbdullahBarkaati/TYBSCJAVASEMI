package com.example.demo;

import java.util.Scanner;

interface CubeFunctionalInterface {
    public void calculate (int n);
}

public class SetAQ4 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        CubeFunctionalInterface cube = num -> {
            System.out.println("Cube Of Number " + num +" = " + num*num*num);
        };
        cube.calculate(n);
    }
}
