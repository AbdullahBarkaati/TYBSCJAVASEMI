package com.example.demo.tySlips.Slip1;

//subject name starts with A or a

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SubjectLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Subjects...");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter Subject....");
            ll.add(sc.next());
        }

        ListIterator listIterator = ll.listIterator();
        while (listIterator.hasNext()) {
            String tmp = listIterator.next().toString();
            if (tmp.startsWith("A")) {
                System.out.println(tmp);;
            }
        }
    }
}
