package com.example.demo;

import java.util.Scanner;

public class P1SetAQ4 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number Of Elements In Array");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("Enter Array Element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements In Reverse Order Are");
        for (int i=n-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
