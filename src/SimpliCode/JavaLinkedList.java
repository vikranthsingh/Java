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

        /*LinkedList<String> name = new LinkedList<>();
        name.add("i");
        name.add("k");
        System.out.println(name);

        name.addFirst("V");
        System.out.println(name);

        name.add(3, "e");
        name.addLast("y");
        System.out.println(name);
        System.out.println(name.indexOf("k"));

        name.removeFirst();
        name.remove("i");
        name.remove(2);
        name.remove("k");
        name.removeLast();
        System.out.println(name);*/

        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(4);
        System.out.println(num.get(2));
        num.add(2, 3);
        System.out.println(num.get(2));
    }
}
