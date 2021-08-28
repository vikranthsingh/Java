package SimpliCode;

import java.util.HashSet;
import java.util.Set;

public class JavaHashset {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("C");
        //System.out.println(hashset);
        //System.out.println(hashset.contains("C"));
        hashset.remove("C");
        //System.out.println(hashset);
        //System.out.println();
        HashSet<Integer> has = new HashSet<>();
        has.add(2);
        has.add(3);
        has.add(1);
        has.add(1);
        //has.remove(1);
        //System.out.println(has.contains(2));
        //System.out.println(has.remove(1));
        //System.out.println(has);
        for (int a : has
             ) {
            System.out.print(a + " ");
        }
    }
}
