package com.example.demo;

/** This code demonstrates about use of javadoc
 * @version 1.0
 * @author AbBarkaati
 */
class MyNumber {
    private int num;

    /**Constructs Object with 0 value
     */
    MyNumber() {
        num = 0;
    }

    /**
     *
     * @param num
     */
    MyNumber(int num) {
        this.num = num;
    }

    void isNegative() {
        if (num<0) {
            System.out.println("Number: "+ num + " Is Negative");
        }
    }

    void isPositive() {
        if (num>0) {
            System.out.println("Number: "+ num + " Is Positive");
        }
    }

    void isZero() {
        if (num == 0) {
            System.out.println("Number: "+ num + " Is Zero");
        }
    }

    void isOdd() {
        if (num%2 != 0) {
            System.out.println("Number: "+ num + " Is Odd");
        }
    }

    void isEven() {
        if (num%2 == 0) {
            System.out.println("Number: "+ num + " Is Even");
        }
    }
}

public class P1SetBQ2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber();
        MyNumber obj2 = new MyNumber(n);

        obj.isPositive();
        obj.isNegative();
        obj.isZero();
        obj.isEven();
        obj.isOdd();

        obj2.isNegative();
        obj2.isPositive();
        obj2.isZero();
        obj2.isEven();
        obj2.isOdd();
    }
}
