package SimpliCode;

public class JavaSwitch {
    public static void main(String[] args) {
        int month = 5;
        String monthName = null;
        switch (month){
            case 1 :
                monthName = "Jan";
                break;
            case 2 :
                monthName = "Feb";
                break;
            case 3 :
                monthName = "March";
                break;
            case 4 :
                monthName = "April";
                break;
            default:
                monthName = "Leap Year";
        }
        System.out.println("monthName: " + monthName);
    }
}
