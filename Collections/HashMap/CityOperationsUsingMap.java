import java.util.HashMap;
import java.util.*;
import java.lang.*;

public class CityOperationsUsingMap {

    public static void main(String[] args) {

        HashMap<String, Integer> cityMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int ch, code;
        String nm;
        do {
            System.out.println(" Please select Option....");
            System.out.println("1- Add city & code");
            System.out.println("2- Remove City");
            System.out.println("3- Search City");
            System.out.println("4- Display City List");
            System.out.println("Enter Your Choice...");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter City Name and Code...");
                    nm = sc.next();
                    code = sc.nextInt();
                    cityMap.put(nm, code);
                    break;
                case 2:
                    System.out.println("Enter City Name to remove...");
                    nm = sc.next();
                    cityMap.remove(nm);
                    break;
                case 3:
                    System.out.println("Enter City Name to search....");
                    nm = sc.next();
                    if (cityMap.containsKey(nm)) {
                        System.out.println("Code ===:> " + cityMap.get(nm));
                    }
                    break;
                case 4:
                    System.out.println("City List : " + cityMap);
            }
        } while (ch!=5);
    }
}
