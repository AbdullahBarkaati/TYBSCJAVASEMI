package com.example.demo;



class MyNumber1 {
    private int n;

    //default constructor
    MyNumber1() {
        this.n = 0;
    }

    //parameterized constructor
    MyNumber1( int n ) {
        this.n = n;
    }

    void isNegative() {
        if( n < 0 ) {
            System.out.println("Number " + n + " Is Negative");
        }
    }

    void isPositive() {
        if( n > 0 ) {
            System.out.println("Number " + n + " Is Positive");
        }
    }

    void isZero() {
        if( n == 0 ) {
            System.out.println("Number " + n + " Is Zero");
        }
    }

    public static void main(String[] args) {
        MyNumber1 num = new MyNumber1();

        int tmp = 5; //Integer.parseInt(args[0]); java MyNumber 10

        MyNumber1 num1 = new MyNumber1(tmp);

        num.isPositive();
        num.isNegative();
        num.isZero();

        num1.isNegative();
        num1.isPositive();
        num1.isZero();

    }

}