package com.example.demo;

import java.util.Scanner;

class CovidPositive extends Exception {
    /*CovidPositive(String msg) {
        super(msg);
    }*/
    CovidPositive() {
        System.out.println("Patient is Covid Positive(+) and\n" +
                "Need to Hospitalized");
    }
}

public class Patient {
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;

    Patient(String patient_name, int patient_age, int patient_oxy_level, int patient_HRCT_report) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_HRCT_report = patient_HRCT_report;
        this.patient_oxy_level = patient_oxy_level;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int oxyLevel, pAge, report;
            String pnm;
            System.out.println("Enter Patient Name, Age, Oxygen Level & HRCT Report");
            pnm = sc.next();
            pAge = sc.nextInt();
            oxyLevel = sc.nextInt();
            report = sc.nextInt();
            Patient p = new Patient(pnm, pAge, oxyLevel, report);
            if (p.patient_oxy_level<95 && report>10) {
                throw new CovidPositive();
            } else {
                System.out.println("Patient Details Are");
                System.out.println("Name: " + p.patient_name + " Age: " + p.patient_age);
                System.out.println("Oxygen Level: " + p.patient_oxy_level);
                System.out.println("HRCT Report: " + p.patient_HRCT_report);
            }

        }catch (CovidPositive e) {
            System.out.println("Exception Caught");
            //System.out.println(e.getMessage());
        }
    }


}
