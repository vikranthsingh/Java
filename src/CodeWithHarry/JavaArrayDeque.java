package CodeWithHarry;

import java.util.ArrayDeque;

public class JavaArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.addFirst(10);
        a.addLast(20);
        System.out.println(a);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}
