//display count of even and odd numbers in set.

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CountEvenOddElements {
    public static void main(String[] args) {
        TreeSet<Integer> intSet = new TreeSet<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Integers...");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println("Enter Number...");
            intSet.add(sc.nextInt());
        }
        System.out.println(intSet);

        Iterator itr = intSet.iterator();
        int ocnt=0, ecnt=0;
        while (itr.hasNext()) {
            if ((int) itr.next() % 2 == 0) {
                ocnt++;
            } else {
                ecnt++;
            }
        }
        System.out.println("Total Number Of Odd elements...." + ocnt);
        System.out.println("Total Number Of Even elements...." + ecnt);
    }
}
