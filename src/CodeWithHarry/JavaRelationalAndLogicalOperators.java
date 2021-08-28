package CodeWithHarry;

public class JavaRelationalAndLogicalOperators {
    public static void main(String[] args) {
        //&& , ||
        int a = 7;
        int b = 6;

        // AND Operator
        if (a < 10 && b > 5){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        // OR Operator
        if (a < 6 || b > 5){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        // Not
        boolean isTrue = false;
        if (!isTrue) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
