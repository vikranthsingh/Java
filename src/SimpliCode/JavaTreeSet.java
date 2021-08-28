package SimpliCode;

import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        //System.out.println(treeSet);

        Set<Integer> tree = new TreeSet<>();
        tree.add(3);
        tree.add(3);
        tree.add(1);
        tree.add(2);
        //tree.remove(3);
        //System.out.println(tree.contains(3));
        System.out.println(tree.isEmpty());
        System.out.println(tree);
    }
}
