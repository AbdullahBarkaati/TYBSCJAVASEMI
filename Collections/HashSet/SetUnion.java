//Write a Java program to find union of two sets.

import java.util.HashSet;

public class SetUnion {

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
        for(Object n: hs2) {
            if ( !tmp.contains(n)) {
                tmp.add(n);
            }
        }

        System.out.println("Union Of " + hs1 + " And " + hs2 + " Is " + tmp);
    }
}
