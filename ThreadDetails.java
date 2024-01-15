package com.example.demo.tySlips.Slip5;

class ThreadLifeCycle extends Thread {
    public ThreadLifeCycle(String s) {
        super(s);
    }

    public void run() {
        System.out.println(getName() + " thread created.");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("THREAD NAME : "+this.getName()+"\n"+" THREAD PRIORITY : "+this.getPriority());
            int s = (int) (Math.random() * 5000);
            System.out.println(getName() + " is sleeping for : " + s + " mile sec");
            try {
                Thread.sleep(s);
            } catch (Exception ignored) {
            }
        }
    }
}
class ThreadDetails{
    public static void main(String[] args) {
        ThreadLifeCycle t1=new ThreadLifeCycle("abc"),t2=new ThreadLifeCycle("xyz");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(Exception ignored) {}
        System.out.println(t1.getName()+" thread dead.");
        System.out.println(t2.getName()+" thread dead.");
    }
}