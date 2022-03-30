package SimpliCode;

public class JavaNestedIf {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("1 true");
            if (a < 12) {
                System.out.println("2 true");
                if (a > 8) {
                    System.out.println("3 is true");
                    if (a != 10){
                        System.out.println("4 is true");
                    }
                }
            }
        }
    }
}
