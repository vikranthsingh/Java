package SimpliCode;

public class JavaSwitch {
    public static void main(String[] args) {
        int month = 5;
        String name;
        switch (month) {
            case 1:
                name = "Jan";
                break;
            case 2:
                name = "Feb";
                break;
            case 3:
                name = "Mar";
                break;
            case 4:
                name = "Apri";
                break;
            default:
                name = "Invalid Month";
        }
        System.out.println(name);
    }
}
