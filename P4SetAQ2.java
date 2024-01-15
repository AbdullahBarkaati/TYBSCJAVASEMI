package com.example.demo;

import java.io.*;
import java.util.Scanner;

public class P4SetAQ2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        char c;
        int size;
        /*FileInputStream fis = new FileInputStream("C:\\Users\\asabir\\Downloads\\demo\\src\\main\\java\\com\\example\\demo\\abc.txt");
        BufferedInputStream br = new BufferedInputStream(fis);
        size = fis.available();
        for (int i=size-1; i>=0; i--) {
            br.mark(i);
            br.skip(i);
            c = (char) br.read();
            System.out.println(c);
            br.reset();
        }*/

        FileReader file=new FileReader("C:\\Users\\asabir\\Downloads\\demo\\src\\main\\java\\com\\example\\demo\\abc.txt");
        Scanner sc=new Scanner(file);
        String s;
        while(sc.hasNext()) {
            StringBuffer sb = new StringBuffer();
            s = sc.next();
            String s1 = s.toUpperCase();
            sb.append(s1);
            sb.reverse();
            System.out.println(sb);
        }


            //br.close();
    }
}
