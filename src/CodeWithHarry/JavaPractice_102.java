package CodeWithHarry;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class JavaPractice_102 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(10);
        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
        students.add("E");
        students.add("F");
        students.add("G");
        students.add("H");
        students.add("I");
        students.add("J");
        for (String s : students
             ) {
            //System.out.println(s);
        }
        //5
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1);
        //System.out.println(s);

        HashMap<String, Integer> h = new HashMap<>();
        h.put("A", 1);
        h.put("B", 1);
        h.put("C", 1);
        h.put("D", 1);
        h.put("E", 1);
        for (Map.Entry<String, Integer> s1 : h.entrySet()
                ) {
            //System.out.println(s1.getKey() + " " + s1.getValue());
        }
        //2
        Date date = new Date();
        System.out.println(date.getHours() + " : " + date.getMinutes() + " : " + date.getSeconds());

        //3
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR) + " : " + calendar.get(Calendar.MINUTE) + " : " + calendar.get(Calendar.SECOND));

        //4
        LocalTime localTime = LocalTime.now();
        //System.out.println(localTime);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("HH : mm : ss a");
        String d1 = localTime.format(d);
        System.out.println(d1);
    }
}
