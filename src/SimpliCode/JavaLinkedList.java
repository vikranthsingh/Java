package SimpliCode;

import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        //System.out.println(l);
        //System.out.println(l.indexOf(1));

        l.addFirst(0);
        //System.out.println(l);
        //System.out.println(l.indexOf(1));
        /*l.addLast(5);
        System.out.println(l);

        l.remove(0);
        l.remove(4);
        System.out.println(l);

        l.add(2, 3);
        System.out.println(l);

        l.removeLast();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);*/

        LinkedList<String> link = new LinkedList<>();
        link.add("i");
        link.add("k");
        link.add("e");
        link.addFirst("V");
        link.addLast("y");
        link.add(2, "K");
        link.remove("K"); //remove object
        link.remove(3);
        link.removeFirst();
        link.removeLast();
        link.remove(1);
        for (String a : link
             ) {
            System.out.println(a);
        }

    }
}
