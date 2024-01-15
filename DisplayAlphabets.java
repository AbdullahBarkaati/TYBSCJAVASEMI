package com.example.demo.tySlips.Slip19;

public class DisplayAlphabets extends Thread{

    char c;
    public void run() {
        for ( c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + "-");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DisplayAlphabets dObj = new DisplayAlphabets();
        dObj.start();
    }
}
