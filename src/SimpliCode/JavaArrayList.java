package SimpliCode;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
      List<Integer> num = new ArrayList<>();
      num.add(0, 0);
      num.add(1);
      num.add(1, 2);
      num.add(3);
        System.out.println(num);
    }
}
