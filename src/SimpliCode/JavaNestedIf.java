package SimpliCode;

public class JavaNestedIf {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10){
            System.out.println("First Condition is True");
            if (a <= 10){
                System.out.println("Second Condition is True");
                if (a < 11){
                    System.out.println("Third Condition is True");
                }
            }
        }
        //int b = 10;
        /*if (a == b){
            System.out.println("First Condition is True");
            if (a > 8 ){
                System.out.println("Second Condition is True");
                if (b == a){
                    System.out.println("Third Condition is True");
                    if (a == b){
                        System.out.println("True");
                    }
                }
            }
        }*/
    }
}
