package com.example.demo;

import java.util.Scanner;

public class P1SetAQ3 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choices are.....");
            System.out.println("1- Calculate Volume Of Cylinder");
            System.out.println("2- Find Factorial");
            System.out.println("3- Check ArmStrong");
            System.out.println("4- exit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int radius, height;
                    System.out.println("Enter radius and height of cylinder");
                    radius = sc.nextInt();
                    height = sc.nextInt();
                    System.out.println("Volume Of Cylinder: " + Math.PI*radius*radius*height);
                    break;
                case 2:
                    int num, res=1, i=1;
                    System.out.println("Enter Number to find factorial");
                    num = sc.nextInt();
                    while(i<=num) {
                        res = res*i;
                        i++;
                    }
                    System.out.println("Factorial Of Number: "+ num +" Is: " + res);
                    break;
                case 3:
                    int n, temp, digits=0, result=0, dig;
                    System.out.println("Enter Number to check");
                    n = sc.nextInt();
                    temp = n;
                    //count number of digits in number
                    while(temp>0) {
                        temp = temp/10;
                        digits++;
                    }
                    //calculates power of each digit and adds in result
                    temp = n;
                    while(temp>0) {
                        dig = temp%10;
                        result += Math.pow(dig, digits);
                        temp = temp/10;
                    }

                    if(result == n) {
                        System.out.println("Number: "+ n +" Is Armstrong");
                    } else {
                        System.out.println("Number: "+ n +" Is Not Armstrong");
                    }
                    break;
            }

        }while(choice!=4);
    }
}
