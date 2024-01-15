package com.example.demo;

import java.io.*;
import java.util.Scanner;

public class P4SetAQ3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String f1, f2, line;
        System.out.println("Enter Two Files Name");
        Scanner sc = new Scanner(System.in);
        f1 = sc.next();
        f2 = sc.next();
        int c;
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2, true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        /*while ((line = br.readLine()) != null) {
            bw.write(line);
        }*/
        while((c=fr.read()) != -1) {
            System.out.println((char)c);
            fw.write((char)c);
        }
        fw.append("\nEnd Of File");
        fw.close();
    }
}
