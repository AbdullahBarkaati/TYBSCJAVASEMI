package com.example.demo;

import com.example.demo.StringOperation.StringCom;
import com.example.demo.StringOperation.StringCon;

import java.util.Scanner;

public class P2SetCQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter Two Strings");
        str1 = sc.next();
        str2 = sc.next();
        StringCon stringCon = new StringCon(str1,str2);
        StringCom stringCom = new StringCom(str1,str2);
        stringCon.concat();
        stringCom.compare();
    }
}
