package SimpliCode;

public class JavaSwitch {
    public static void main(String[] args) {
        int month = 1; //Constant
        char day = 0;
        switch (month) {
            case 1:
                day = 'M';
                break;
            case 2:
                day = 'T';
                break;
        }
        System.out.println("Day " + day);
    }
}
