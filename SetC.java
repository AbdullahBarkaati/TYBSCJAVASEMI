package com.example.demo;

import java.util.Scanner;

interface DepartmentInterface {
    String departmentName = "Com. Sci. Dept.";
    String HOD = "Naveed Sir";

    void display();
}

class Hostel {
    String hostel_name;
    String hostel_location;
    int no_of_rooms;

    void display() {
        System.out.println("Hostel Name = " + hostel_name + " Location = " + hostel_location
        + " Number Of Rooms = " + no_of_rooms);
    }
}

class Student extends Hostel implements DepartmentInterface {

    String student_name;
    int reg_num;
    String elective_subject;
    double avg_marks;

    Student(String hnm, String hLc, int nrooms, String snm, int rno, String esubj, double avg) {
        super.hostel_name = hnm;
        super.hostel_location = hLc;
        super.no_of_rooms = nrooms;
        this.student_name = snm;
        this.reg_num = rno;
        this.elective_subject = esubj;
        this.avg_marks = avg;
    }

    public void display() {
        super.display();
        System.out.println("Student Name = " + student_name + " reg. Number = " + reg_num
        + " Elective Subjects = " + elective_subject + " avg marks = " + avg_marks );
    }
}

public class SetC {

    public static void main(String[] args) {
        int choice, no_of_rooms, reg_num;
        double avg_marks;
        String hostel_name, student_name, hostel_location, elective_subjects;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Choices are.....");
            System.out.println("1- Admit New Student");
            System.out.println("1- Migrate Student");
            System.out.println("1- Display Details of student");
            System.out.println("4- exit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Hostel Name, Location & Number Of Rooms");
                    hostel_name = sc.next();
                    hostel_location = sc.next();
                    no_of_rooms = sc.nextInt();
                    System.out.println("Enter Student Name, reg. Num, Elective Subj. & percent");
                    student_name = sc.next();
                    reg_num = sc.nextInt();
                    elective_subjects = sc.next();
                    avg_marks = sc.nextDouble();

                    Student student = new Student(hostel_name, hostel_location, no_of_rooms,
                            student_name, reg_num, elective_subjects, avg_marks);
                    student.display();
                    break;
                case 2:
                    //ToDo
                    break;
                case 3:
                    //ToDo
                    break;
            }

        }while(choice!=4);
    }
}
