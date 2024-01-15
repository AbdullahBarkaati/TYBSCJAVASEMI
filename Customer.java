package com.example.demo.SY;

public class Customer {
    public int cId;
    protected String cnm;
    private String add;
    int mobyl;
}

class CustomerAccess {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.cId = 1;
        customer.cnm = "abc";
        customer.mobyl = 1234;
        //customer.add;
    }
}
