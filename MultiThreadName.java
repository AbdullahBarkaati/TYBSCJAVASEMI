package com.example.demo.tySlips.Slip15;

//print thread name if start with vowel

class MultiThreadName extends Thread{
    String tnm;
    @Override
    public void run() {
        tnm = getName();
        if (tnm.startsWith("a") || tnm.startsWith("e") || tnm.startsWith("i")
                || tnm.startsWith("o") || tnm.startsWith("u")) {
            System.out.println("Current thread is "+getName());
        } else {
            System.out.println("Thread Name Not start with vowel.....");
        }
    }
    public static void main(String[] args) {
        MultiThreadName thread1 = new MultiThreadName();
        thread1.setName("first thread");
        MultiThreadName thread2 = new MultiThreadName();
        thread2.setName("second thread");
        MultiThreadName thread3 = new MultiThreadName();
        thread3.setName("third thread");
        MultiThreadName thread4 = new MultiThreadName();
        thread4.setName("fourth thread");
        MultiThreadName thread5 = new MultiThreadName();
        thread5.setName("fifth thread");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}