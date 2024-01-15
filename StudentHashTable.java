package com.example.demo.tySlips.Slip12;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

//Write a program that uses Hashtable for storing and retrieving student record.
//(Containing name and percentage).
//Display the details of student having highest percentage.

public class StudentHashTable {

    public static void main(String[] args) {

        Hashtable<String, Double> stdHT = new Hashtable<>();
        stdHT.put("Afeefa", 78.45);
        stdHT.put("Aamra", 82.12);
        stdHT.put("Nausheen", 75.34);
        stdHT.put("Najam", 79.12);
        stdHT.put("Juveriya", 80.96);
        stdHT.put("Roaiba", 72.46);
        stdHT.put("Asma", 86.53);
        stdHT.put("Munazza", 63.45);
        stdHT.put("Saba", 61.27);

        System.out.println(stdHT);

        Iterator stdItr = stdHT.keySet().iterator();
        Double max = 0d;
        while (stdItr.hasNext()) {
            Double tmp = stdHT.get(stdItr.next());
            if ( tmp > max) {
                max = tmp;
            }
        }

        System.out.println("Max Percent : " + max);
    }
}
