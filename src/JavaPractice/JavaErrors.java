package JavaPractice;

import java.util.Scanner;

public class JavaErrors {
    public static void main(String[] args) {
        //  int x = 9       Syntax Error

        //Print Prime no. But 9 is not a Prime no. so ita a logical Error
        /*System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1);
        }*/

        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int a = 10;
        if (i == 0){
            throw new ArithmeticException("Cannot divide by 0 \t : Error");
        }else {
            int c = a / i;
            System.out.println("The result for 10 div by " + i + " is : " + c);
        }

    }
}
