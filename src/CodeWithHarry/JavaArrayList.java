package CodeWithHarry;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(5);
        List<Integer> l2 = new ArrayList<>(5);
        l1.add(4);
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6, 6);
        //System.out.println(l1);
        //System.out.println(l1.lastIndexOf(4));
        //l1.addAll(l2);
        /*for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }*/
        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        for (String a : arr
             ) {
            System.out.println(a);
        }
    }
}
