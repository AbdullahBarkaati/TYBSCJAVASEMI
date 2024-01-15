package com.example.demo.tySlips.Slip19;

//Write a Java program that swaps two elements in a linked list.

import java.util.*;

public class SwapTwoElementsLL {

    public static void main(String[] args) {

        LinkedList <String> l_list = new LinkedList <String> ();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("The Original linked list: " + l_list);
        int pos1, pos2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positions to swap.....");
        pos1 = sc.nextInt();
        pos2 = sc.nextInt();
        Collections.swap(l_list, pos1, pos2);
        System.out.println("The New linked list after swap: " + l_list);
    }
}