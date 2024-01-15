package com.example.demo;

import java.util.Scanner;

public class P2SetAQ4 {
    public static void main(String[] args) {
        String fnm, lnm, mnm, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First, Middle And Last Name");
        fnm = sc.next();
        mnm = sc.next();
        lnm = sc.next();
        res = lnm + fnm + mnm.substring(0,1).toUpperCase()+mnm.substring(1);
        System.out.println(res);
    }
}
