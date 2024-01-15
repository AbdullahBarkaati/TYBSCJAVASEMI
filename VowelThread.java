package com.example.demo.tySlips.Slip9;

//display vowel letters after every 2 seconds

public class VowelThread extends Thread{

    char c;
    public void run() {
        for ( c = 'A'; c <= 'Z'; c++) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println(c + "-");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        VowelThread dObj = new VowelThread();
        dObj.start();
    }
}
