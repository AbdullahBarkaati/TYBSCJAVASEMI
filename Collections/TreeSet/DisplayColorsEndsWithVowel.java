//check whether color name ends with vowel or not, if yes display it.

import java.util.Iterator;
import java.util.TreeSet;

public class DisplayColorsEndsWithVowel {
    public static void main(String[] args) {
        TreeSet<String> colorSet = new TreeSet<>();
        colorSet.add("Green");
        colorSet.add("Orange");
        colorSet.add("Yellow");
        colorSet.add("White");
        colorSet.add("Pink");
        colorSet.add("Blue");
        System.out.println(colorSet);

        Iterator clrItr = colorSet.iterator();
        while (clrItr.hasNext()) {
            String tmp = clrItr.next().toString().toUpperCase();
            if (tmp.endsWith("A") || tmp.endsWith("E") || tmp.endsWith("I")
            || tmp.endsWith("O") || tmp.endsWith("U")) {
                System.out.println(tmp);
            }
        }
    }
}
