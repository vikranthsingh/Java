package CodeWithHarry;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaGregorianCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR) +" : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.getTimeZone());

        //GregorianCalendar
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
    }
}
