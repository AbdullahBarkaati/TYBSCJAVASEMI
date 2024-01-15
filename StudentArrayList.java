package com.example.demo.tySlips.Slip14;

//write a java program to store student object (name, percentage) into arraylist.
//sort student using comparator based on percentage.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    Double perc;
    
    Student(String name, Double perc) {
        this.name = name;
        this.perc = perc;
    }
    
    public String toString() {
        return " Name = " + name + " Percentage = " + perc;
    }
}

class SortByPerc implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.perc == o2.perc) {
            return 0;
        }
        if (o1.perc > o2.perc) {
            return 1;
        }
        return -1;
    }
}

public class StudentArrayList {
    
    public static void main(String[] args) {
        ArrayList<Student> stdAL = new ArrayList<>();
        stdAL.add(new Student("Afeefa", 78.45));
        stdAL.add(new Student("Aamra", 82.12));
        stdAL.add(new Student("Nausheen", 75.34));
        stdAL.add(new Student("Najam", 79.12));
        stdAL.add(new Student("Juveriya", 80.96));
        stdAL.add(new Student("Roaiba", 72.46));
        stdAL.add(new Student("Asma", 86.53));
        stdAL.add(new Student("Munazza", 63.45));
        stdAL.add(new Student("Saba", 61.27));
        System.out.println("Unsorted..." + stdAL);
        Collections.sort(stdAL, new SortByPerc());
        System.out.println("After Sorting..." + stdAL);
    }
}
