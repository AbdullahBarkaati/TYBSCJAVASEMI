import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AccedptStudentsThroughCMDAndDisplay {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Students....");
        n = sc.nextInt();
        if (args.length < n) {
            System.out.println("Please Enter " + n + " Number Of Students Through Command Line");
        } else {
            LinkedList ll = new LinkedList();
            for ( String str:args ) {
                ll.add(str);
            }

            Iterator itr = ll.listIterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
}
