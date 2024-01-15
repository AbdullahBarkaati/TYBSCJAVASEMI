package com.example.demo.tySlips.Slip2;

public class NameThread extends Thread {
    String str;
    int n;

    NameThread(String str, int n) {
        this.str = str;
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(getName() + " : " + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        NameThread t1 = new NameThread("COVID19", 10);
        NameThread t2 = new NameThread("LOCKDOWN2020", 20);
        NameThread t3 = new NameThread("VACCINATED", 30);

        t1.start();
        t2.start();
        t3.start();

    }
}