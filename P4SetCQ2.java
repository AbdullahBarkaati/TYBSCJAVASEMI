package com.example.demo;

import java.util.Scanner;

class InvalidNameException extends Exception {
    InvalidNameException(String nm) {
        System.out.println(nm + " Name is invalid");
    }
}

public class P4SetCQ2 {
    public static void main(String[] args) {
        String emp_name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        emp_name = sc.next();
        try {
            if (!emp_name.matches("[a-zA-Z]+")) {
                throw new InvalidNameException(emp_name);
            } else {
                System.out.println(emp_name + " Is Valid Name");
            }
        } catch (InvalidNameException n) {}
    }

}
