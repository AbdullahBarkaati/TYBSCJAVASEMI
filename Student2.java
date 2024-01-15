package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Student2 {
    int rno;
    String name;
    double perc;

    Student2(int rno, String name, double perc) {
        this.rno = rno;
        this.name = name;
        this.perc = perc;
    }

    static Student2[] sortStudent(Student2[] arr) {
        Student2 temp;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if(arr[i].perc>arr[j].perc) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    void display() {
        System.out.println("Roll Number: " + rno +" Name: " + name + " Percentage: " + perc);
    }

    public static void main(String[] args) {
        /*int n;
        Scanner sc = new Scanner(System.in);
        int rno;
        String name;
        double perc;
        System.out.println("Enter Number Of Objects");
        n = sc.nextInt();
        Student2[] arr = new Student2[n];
        for (int i=0; i<n; i++) {
            System.out.println("Enter Student Details [Roll Number, Name, Percentage]");
            rno = sc.nextInt();
            name = sc.next();
            perc = sc.nextDouble();
            arr[i] = new Student2(rno, name, perc);
            arr[i].display();
        }
        sortStudent(arr);
        for (Student2 s:arr) {
            s.display();
        }*/

        /*int j = 0;
        int i = ++j+i-5;
        System.out.println("i = " + i);
*/
        List<UUID> tmp = new ArrayList<>(5);
        for (int i=0; i<5; i++) {
            tmp.add(UUID.randomUUID());
        }

        String str = new String("UUID's : " + tmp);

        System.out.println(str);
        //tmp.forEach(System.out::println);
        //System.out.print("List : {}", tmp.toString());
    }
}
