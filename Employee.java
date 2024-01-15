package com.example.demo;

public class Employee {
    int id;
    String name;
    String dept;
    int salary;
    static int cnt = 0;

    Employee() {
        this.id = 0;
        this.name = "";
        this.dept = "";
        this.salary = 0;
        cnt++;
    }

    Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        cnt++;
    }

    static int getCnt() {
        return cnt;
    }

    void display() {
        System.out.println("Employee ID: "+ this.id +"Name: "+ this.name+ "" +
                "Department: "+ this.dept + "Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
        System.out.println("Object Count = "+ getCnt());
        Employee emp = new Employee(111,"Barkaati","CS",15000);
        emp.display();
        System.out.println("Object Count = "+ getCnt());
    }
}
