package com.example.demo.tySlips.Slip3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class NegativeLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Elements...");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter Number....");
            ll.add(sc.nextInt());
        }

        ListIterator listIterator = ll.listIterator();
        while (listIterator.hasNext()) {
            int temp = (int)listIterator.next();
            if ( temp < 0) {
                System.out.println(temp);
            }
        }
    }
}
