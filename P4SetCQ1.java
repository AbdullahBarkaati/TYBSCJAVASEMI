package com.example.demo;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class P4SetCQ1 {
    public static void main(String[] args) throws IOException {
        int choice;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\asabir\\Downloads\\demo\\src\\main\\java\\com\\example\\demo\\number.txt");
        FileOutputStream fos = new FileOutputStream(file);
        FileReader fis = new FileReader(file);
        DataOutputStream dos = new DataOutputStream(fos);
        BufferedReader br = new BufferedReader(fis);
        do {
            System.out.println("Choices Are....");
            System.out.println("1-----Load");
            System.out.println("2-----Save");
            System.out.println("3-----Short");
            System.out.println("Enter Your Choice...");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Random random = new Random();
                    for (int i=0; i<10; i++) {
                        arr[i] = random.nextInt(90) + 10;
                        System.out.println(arr[i]);
                    }
                    break;
                case 2:
                    for (int j : arr) {
                        System.out.println(j);
                        dos.writeInt(j);
                    }
                    break;
                case 3:
                    String c;
                    while((c=br.readLine()) != null) {
                        System.out.println(c);
                    }
            }
        } while(choice!=3);
    }
}
