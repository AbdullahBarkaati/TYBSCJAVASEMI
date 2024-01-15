package com.example.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class InvalidDateException extends Exception {
    InvalidDateException() {
        System.out.println("Invalid Date");
    }
}

public class MyDate {
    int day;
    int month;
    int year;

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1800;

    // Returns true if
    // given year is valid.
    boolean isLeap(int year)
    {
        // Return true if year is
        // a multiple of 4 and not
        // multiple of 100.
        // OR year is multiple of 400.
        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }

    // Returns true if given
    // year is valid or not.
     boolean isValidDate()
    {
        // If year, month and day
        // are not in given range
        if (this.year > MAX_VALID_YR ||
                this.year < MIN_VALID_YR)
            return false;
        if (this.month < 1 || this.month > 12)
            return false;
        if (this.day < 1 || this.day > 31)
            return false;

        // Handle February month
        // with leap year
        if (this.month == 2)
        {
            if (isLeap(this.year))
                return (this.day <= 29);
            else
                return (this.day <= 28);
        }

        // Months of April, June,
        // Sept and Nov must have
        // number of days less than
        // or equal to 30.
        if (this.month == 4 || this.month == 6 ||
                this.month == 9 || this.month == 11)
            return (this.day <= 30);

        return true;
    }

    void displayDate() {
        System.out.println("Date is : " + this.day + "-" + this.month + "-" + this.year);
    }

    public static void main(String[] args) {
        String date;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter - Separated Date....");
        date = sc.next();

        //System.out.println(System.in);
        String[] dateArr = date.split("-");
        MyDate myDate = new MyDate(Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1]),
                Integer.parseInt(dateArr[2]));
        try {
            if (!myDate.isValidDate()) {
                throw new InvalidDateException();
            } else {
                System.out.println("Date Is Valid");
                myDate.displayDate();
            }
        } catch (InvalidDateException e){}
    }
}
