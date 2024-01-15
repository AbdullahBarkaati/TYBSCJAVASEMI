package com.example.demo.tySlips.Slip6;

public class ThreadInfo extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Name : " + getName());
        System.out.println("Thread Priority : " + getPriority());
        System.out.println("Thread ID : " + getId());
    }

    public static void main(String[] args) {
        ThreadInfo t = new ThreadInfo();
        t.start();
    }
}
