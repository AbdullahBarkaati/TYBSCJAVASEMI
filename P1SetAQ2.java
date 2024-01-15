package com.example.demo;


import java.util.Scanner;

public class P1SetAQ2 {

    public static void main(String[] args) {
        int len, br;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length And Breadth Of Rectangle");
        len = sc.nextInt();
        br = sc.nextInt();
        System.out.println("Area Of Rectangle: "+ len*br);
        System.out.println("Perimeter Of Rectangle: "+ 2*(len+br));
    }

}
