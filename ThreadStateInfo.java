package com.example.demo.tySlips.Slip20;

// Java program to get the state, name and priority of the
// currently executing thread

class MyThread implements Runnable {
    public void run() {
        try {
            Thread.State thrdState = Thread.currentThread().getState();
            System.out.println("Thread State: " + thrdState);
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        } catch (Exception e) {

        }
    }
}

public class ThreadStateInfo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t3.start();
    }
}