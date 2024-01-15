package com.example.demo.tySlips.Slip12;
// Java program to suspend and
// resume a thread and print current executing thread name and id.

class MyThread implements Runnable {
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        } catch (Exception e) {

        }
    }
}

public class SuspendAndStartThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        t2.resume();
    }
}
