package com.example.demo.tySlips.Slip9;

import java.util.LinkedList;
import java.util.Scanner;

public class LLOps {

    public static void main(String[] args) {
        int n, ch;
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1- Add element at start");
            System.out.println("2- Delete Last element");
            System.out.println("3- Display Size OF LL");
            System.out.println("4- Display LL");
            System.out.println("Enter Your Choice.....");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter An Element To Add At Start...");
                    ll.addFirst(sc.nextInt());
                    break;
                case 2:
                    ll.removeLast();
                    break;
                case 3:
                    System.out.println(ll.size());
                    break;
                case 4:
                    System.out.println(ll);
                    break;
            }
        } while (ch != 5);
    }
}
