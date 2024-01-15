//Write a java program to accept 'n' employee information (id, name).
//And store into hashtable. Display all employee details.
//Search for an employee.

import java.util.Hashtable;
import java.util.Scanner;

public class EmployeeHashTable {
    
    public static void main(String[] args) {

        Hashtable<Integer, String> empHT = new Hashtable<>();
        empHT.put(111,"Afeefa");
        empHT.put(112,"Aamra");
        empHT.put(113,"Nausheen");
        empHT.put(114,"Najam");
        empHT.put(115,"Juveriya");
        empHT.put(116,"Roaiba");
        empHT.put(117,"Asma");
        empHT.put(118,"Munazza");
        empHT.put(119,"Saba");

        System.out.println(empHT);

        String tmp;
        System.out.println("Enter Employee Name To Search.... ");
        Scanner sc = new Scanner(System.in);
        tmp = sc.next();
        if (empHT.containsValue(tmp)) {
            System.out.println("Employee Present.......");
        }
    }
}
