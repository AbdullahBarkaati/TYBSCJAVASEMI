package com.example.demo;

import java.util.Scanner;

public class P1SetBQ3 {
    public static void main(String[] args) {
        int choice;
        int[][] mat1 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] mat2 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] add = new int[3][3];

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choices are.....");
            System.out.println("1- Addition");
            System.out.println("2- Multiplication");
            System.out.println("3- Transpose");
            System.out.println("4- Exit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition Of Matrices are: ");
                    for (int i=0; i<3; i++) {
                        for (int j=0; j<3; j++) {
                            add[i][j] = mat1[i][j]+mat2[i][j];
                            System.out.print(add[i][j]+" ");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("Multiplication Of Matrices are: ");
                    for (int i=0; i<3; i++) {
                        for (int j=0; j<3; j++) {
                            for (int k = 0; k < 3; k++) {
                                add[i][j] = mat1[i][k] + mat2[k][j];
                            }
                            System.out.print(add[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Transpose Of Matrix is: ");
                    for (int i=0; i<3; i++) {
                        for (int j=0; j<3; j++) {
                            add[i][j] = mat1[j][i];
                            System.out.print(add[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
            }

        }while(choice!=4);
    }
}
