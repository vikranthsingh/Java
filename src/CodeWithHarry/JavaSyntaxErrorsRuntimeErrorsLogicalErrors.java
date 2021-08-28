package CodeWithHarry;

import java.util.Scanner;

public class JavaSyntaxErrorsRuntimeErrorsLogicalErrors {
    public static void main(String[] args) {
        //int a = 9     syntax error

        //Logical Error, printing Prime no. but we got 9 which is not a prime no.
        for (int i = 0; i < 5; i++) {
            System.out.println(2*i+1);
        }

        //Runtime Error
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int a = sc.nextInt();
        System.out.println("The value is : " + 100/a);
    }
}
