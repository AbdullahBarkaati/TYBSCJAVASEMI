//Write a Java program to find intersection of two sets.

import java.util.HashSet;

public class SetIntersection {

    public static void main(String[] args) {

        HashSet hs1 = new HashSet();
        HashSet hs2 = new HashSet();

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        hs2.add(3);
        hs2.add(5);
        hs2.add(6);

        HashSet tmp = new HashSet(hs1);
        tmp.retainAll(hs2);

        System.out.println("Intersection Of " + hs1 + " And " + hs2 + " Is " + tmp);
    }
}
