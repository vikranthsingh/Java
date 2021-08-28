package CodeWithHarry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(localDateTime);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-YYYY  a  E  B  u");
        DateTimeFormatter dt2 = DateTimeFormatter.ISO_DATE;
        String date = localDateTime.format(dt2);
        System.out.println(date);
    }
}
