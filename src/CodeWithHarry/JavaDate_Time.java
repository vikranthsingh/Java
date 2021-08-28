package CodeWithHarry;

import java.util.Date;

public class JavaDate_Time {
    public static void main(String[] args) {
        Date date = new Date();     //all the methods are deprecated
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getYear());
    }
}
