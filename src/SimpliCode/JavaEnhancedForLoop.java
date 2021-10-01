package SimpliCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaEnhancedForLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for (int a : arr
             ) {
            //System.out.println(a);
        }
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(1);
        num.add(1);
        num.add(1);
        //System.out.println(num);
        for (int i : num
             ) {
            //System.out.println(i);
        }
        Map<String, Integer> stu = new HashMap<>();
        stu.put("Vik", 57);
        stu.put("Vi", 57);
        stu.put("V", 57);
        for (Map.Entry<String, Integer> e : stu.entrySet()
             ) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}