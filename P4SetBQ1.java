package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class P4SetBQ1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int choice, f=0;
        String book;
        Scanner sc = new Scanner(System.in);
        File file = new File("book.dat");
        RandomAccessFile rf = new RandomAccessFile(file,"r");
        do {
            System.out.println("Choices Are....");
            System.out.println("1-----Search Book");
            System.out.println("2-----Display Book And Cost");
            System.out.println("Enter Your Choice...");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Book Name TO Search...");
                    book = sc.next();
                    rf.seek(0);
                    while (rf.getFilePointer() != file.length()) {
                        String line = rf.readLine();
                        String[] arr = line.split(" ");
                        if(arr[1].equals(book)) {
                            f=1;
                            System.out.println("Book Available");
                            break;
                        } else {
                            f=0;
                        }
                    }
                    if(f==0) {
                        System.out.println("Book Not Available");
                    }
                    break;
                case 2:
                    rf.seek(0);
                    int totalCost = 0;
                    while(rf.getFilePointer() != file.length()) {
                        String line = rf.readLine();
                        String[] arr = line.split(" ");
                        System.out.println("Book Name: " + arr[1]);
                        totalCost += Integer.parseInt(arr[2]) * Integer.parseInt(arr[3]);
                    }
                    System.out.println("Total costs of book = " + totalCost);
                    break;
            }
        } while(choice!=3);
    }
}
