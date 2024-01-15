package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

public class P1SetCQ1 {
    public static void main(String[] args) {
        String[] country;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Countries");
        n = sc.nextInt();
        country = new String[n];
        for (int i=0; i<n; i++) {
            System.out.println("Enter Country Name");
            country[i] = sc.next();
        }
        Arrays.sort(country);
        for (int i=n-1; i>=0; i--) {
            System.out.println(country[i]);
        }
    }
}
