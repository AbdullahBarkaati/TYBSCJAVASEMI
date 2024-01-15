package com.example.demo;

import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String nm;

    Staff(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }
}

class OfficeStaff extends Staff {
    String dept;

    OfficeStaff(int id, String nm, String dept) {
        super(id, nm);
        this.dept = dept;
    }

    void display() {
        System.out.println("Id = " + super.id + " Name= " +
                super.nm + " Department= " + dept);
    }

}

public class SetAQ2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number Of Objects");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        OfficeStaff obj[] = new OfficeStaff[n];

        for (int i=0;i<n;i++) {
            System.out.println("Enter Id, Name and dept");
            obj[i] = new OfficeStaff(1,"abc","BCS");
            obj[i].display();
        }

    }
}


