package com.example.demo.tySlips.Slip16;

//Write a Java program to compare two tree sets and display common elements.

import java.util.TreeSet;

public class CompareTreeSets {

    public static void main(String[] args) {
        TreeSet<String> t_set1 = new TreeSet<>();
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("Free Tree set: "+t_set1);

        TreeSet<String> t_set2 = new TreeSet<>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: "+t_set2);

        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : t_set1){
            if (t_set2.contains(element)) {
                result_set.add(element);
            }
        }
        System.out.println("Common Elements Are...");
        System.out.println(result_set);
    }
}