//Write a Java program to sort keys in a Tree Map by using a comparator.


import java.util.*;

public class SortMapByUsingComparator {

    public static void main(String args[]){
        TreeMap<String,String> tree_map1 = new TreeMap<>(new sort_key());

        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White");
        System.out.println(tree_map1);
    }
}
class sort_key implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

}
