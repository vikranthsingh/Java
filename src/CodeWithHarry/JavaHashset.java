package CodeWithHarry;

import java.util.HashSet;

public class JavaHashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();       //doesn't allow duplicates
        h.add(0);
        h.add(0);
        h.add(1);
        h.add(2);
        h.add(1);
        System.out.println(h);
    }
}
