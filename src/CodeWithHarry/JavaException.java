package CodeWithHarry;

import java.util.Scanner;

public class JavaException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int a = sc.nextInt();
        int res = 100 / a;
        try {
            if (a == 0) {
                throw new ArithmeticException("Error");
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        System.out.println("The result is : " + res);
    }
}
