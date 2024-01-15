package com.example.demo;

import java.util.Scanner;

// class continent with data member name
class Continent {
    String name;

    // parameterized constructor to set continent name
    Continent(String name) {
        this.name = name;
    }

    // member function display to print continent name
    void display() {
        System.out.println("Continent = " + name);
    }
}

class Country extends Continent{
    String name;

    Country(String continentName, String countryName) {
        super(continentName);
        this.name = countryName;
    }

    void display() {
        super.display();
        System.out.println("Country Name = " + name);
    }
}

class State extends Country{
    String place;
    String name;

    State(String continentName, String countryName, String place, String stateName) {
        super(continentName, countryName);
        this.place = place;
        this.name = stateName;
    }

    void display() {
        super.display();
        System.out.printf("State Place = " + place + "\nState Name = " + name);
    }
}

public class SetAQ1 {

    public static void main(String[] args) {

        String continentName, countryName, place, stateName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names of continent, country and state and place");
        continentName = sc.next();
        countryName = sc.next();
        stateName = sc.next();
        place = sc.next();

        State state = new State(continentName, countryName, place, stateName);
        state.display();
    }
}
