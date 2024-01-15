package com.example.demo;

import java.util.Arrays;

public class P2SetAQ3 {
    public static void main(String[] args) {
        int[] temp = new int[5];
        for (int i=0; i<5; i++) {
            temp[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(temp);
        for (int ele:temp) {
            System.out.println(ele);
        }
    }
}
