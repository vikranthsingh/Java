package SimpliCode;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        //arr.set(1, 0);
        //arr.remove(1);
        //arr.clear();
        //System.out.println(arr);

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);
        a.set(0, 0);
        a.set(1, 1);
        a.set(2, 2);
        a.set(3, 3);
        //a.remove(3);
        //System.out.println(a);
        for (int b : a
             ) {
            System.out.print(b + " ");
        }
    }
}
