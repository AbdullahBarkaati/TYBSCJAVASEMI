package com.example.demo.SY;

public class SYMarks {
    int computerTotal;
    int mathsTotal;
    int electronicTotal;

    public SYMarks(int computerTotal, int mathsTotal, int electronicTotal) {
        this.computerTotal = computerTotal;
        this.mathsTotal = mathsTotal;
        this.electronicTotal = electronicTotal;
    }

    public int sum() {
        return computerTotal+mathsTotal+electronicTotal;
    }

    public void display() {
        System.out.println("Computer- " + computerTotal + " Maths- " + mathsTotal
        + " Electronics- " + electronicTotal);
    }
}
