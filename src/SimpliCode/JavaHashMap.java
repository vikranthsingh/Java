package SimpliCode;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        /*Map<String, Integer> name = new HashMap<>();
        name.put("Vik", 1);
        name.put("Vikr", 1);
        name.put("Vikra", 1);
        name.put("Vikran", 1);
        //System.out.println(name.get("Vik"));

        *//*for (String nameMap: name.keySet()
             ) {
            System.out.println(nameMap + " " + name.get(nameMap));
        }*//*
        *//*for (Map.Entry<String, Integer> enter : name.entrySet()
        ) {
            System.out.println(enter.getKey() + " " + enter.getValue());
        }*//*
        HashMap<Integer, String> has = new HashMap<>();
        has.put(1, "vikranth");
        has.put(2, "singh");
        has.put(3, "rajput");
        //System.out.println(has.get(2));
        System.out.println(has.containsKey(1));
        for (Integer a : has.keySet()
             ) {
            System.out.println(a + " " + has.get(a));
        }
        for (Map.Entry<Integer, String> b : has.entrySet()
             ) {
            System.out.println(b.getKey() + " " + b.getValue());
        }*/

        Map<String, String> details = new HashMap<>();
        details.put("vik", "57");
        details.put("viky", "58");
        details.put("vikey", "59");
        //System.out.println(details.size());
        /*boolean a = details.containsKey("vik");
        if (a){
            String value = details.get("vik");
            //System.out.println(value);
        }
        for (String keys : details.keySet()
             ) {
            System.out.println("key: "+ keys + " " + "\tValue: " + details.get(keys));
        }*/
        for (Map.Entry<String, String> dkeys:details.entrySet()
             ) {
            System.out.println("key: "+ dkeys.getKey() + " " + "\tValue: " + dkeys.getValue());
        }
    }
}
