package com.example.demo;

class InvalidUserNameException extends Exception {
    InvalidUserNameException() {
        System.out.println("Invalid Username");
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException() {
        System.out.println("Invalid Password");
    }
}

public class EmailID {
    public static void main(String[] args) {
        String uNm = args[0];
        String pass = args[1];
        try {
            if(uNm.length() < 10) {
                throw new InvalidUserNameException();
            } else if(pass.length() < 8) {
                throw new InvalidPasswordException();
            } else {
                System.out.println("UserName And Password Are Valid");
            }
        } catch (InvalidUserNameException | InvalidPasswordException p) {

        }
    }
}
