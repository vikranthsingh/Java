package CodeWithHarry;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("D", 1);
        h.put("C", 2);
        h.put("B", 3);
        h.put("A", 4);
        for (Map.Entry<String, Integer> b : h.entrySet()
             ) {
            System.out.println(b.getKey() + " " + b.getValue());
        }
    }
}
