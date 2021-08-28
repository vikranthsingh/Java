package SimpliCode;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {
        TreeMap<String , Integer> map = new TreeMap<>();
        map.put("C", 3);
        map.put("B", 2);
        map.put("A", 1);
        //System.out.println(map);
        for (Map.Entry<String, Integer> entry: map.entrySet()
             ) {
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Map<Integer, String> tree = new TreeMap<>();
        tree.put(3, "C");
        tree.put(1, "A");
        tree.put(2, "B");
        for (Map.Entry<Integer, String> t : tree.entrySet()
             ) {
            System.out.println(t.getKey() + " " + t.getValue());
        }
    }
}
