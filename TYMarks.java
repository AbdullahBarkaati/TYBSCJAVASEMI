package com.example.demo.TY;

public class TYMarks {
    int theory;
    int practical;

    public TYMarks(int theory, int practical) {
        this.theory = theory;
        this.practical = practical;
    }

    public int sum() {
        return theory+practical;
    }

    public void display() {
        System.out.println("Theory- " + theory + " Practical- " + practical);
    }
}
