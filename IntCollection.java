package com.example.demo.tySlips.Slip2;

import java.util.HashSet;
import java.util.Scanner;

public class IntCollection {

    public static void main(String[] args) {
        int n, ch;
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1- Add n elements");
            System.out.println("2- Search an element");
            System.out.println("3- Display");
            System.out.println("Enter Your Choice.....");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Number Of Elements...");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter An Element...");
                        hs.add(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("Enter An Element to search...");
                    n = sc.nextInt();
                    if (hs.contains(n)) {
                        System.out.println("Element " + n + " Is Present");
                    } else {
                        System.out.println("Element " + n + " Not Present");
                    }
                    break;
                case 3:
                    System.out.println(hs);
                    break;
            }
        } while (ch!=4);
    }
}
