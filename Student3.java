package com.example.demo;

import com.example.demo.SY.SYMarks;
import com.example.demo.TY.TYMarks;

import java.util.Scanner;

public class Student3 {
    int rno;
    String name;
    SYMarks sy;
    TYMarks ty;

    Student3(int rno, String name, int computerTotal, int mathsTotal, int electronics,
             int theory, int practical) {
        this.rno = rno;
        this.name = name;
        sy = new SYMarks(computerTotal, mathsTotal, electronics);
        ty = new TYMarks(theory, practical);
    }

    public double calculateGrade() {
        return (sy.sum()+ty.sum()) / 500.0*100;
    }

    void display() {
        System.out.println("Roll Number: " + rno + " Name: " + name);
        System.out.println("SY MARKS: ");
        sy.display();
        System.out.println("TY MARKS: ");
        ty.display();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Number Of Objects");
        n = sc.nextInt();
        String nm;
        int rno, math, com, ele, theo, prac;
        Student3[] arr = new Student3[n];
        for (int i=0; i<n; i++) {
            System.out.println("Enter Roll Number & Name Of Student");
            rno = sc.nextInt();
            nm = sc.next();
            System.out.println("Enter Computer, Maths, ELectronics, Theory & Practical Marks");
            com = sc.nextInt();
            math = sc.nextInt();
            ele = sc.nextInt();
            theo = sc.nextInt();
            prac = sc.nextInt();

            arr[i] = new Student3(rno, nm, com, math, ele, theo, prac);
            arr[i].display();
            if (arr[i].calculateGrade() >= 70) {
                System.out.println("Grade-A");
            } else if(arr[i].calculateGrade() >= 60) {
                System.out.println("Grade-B");
            } else if (arr[i].calculateGrade() >= 50) {
                System.out.println("Grade-C");
            } else if (arr[i].calculateGrade() >= 40) {
                System.out.println("Grade-Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
