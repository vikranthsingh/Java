package JavaPractice;

import java.util.Scanner;

public class JavaNestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        try {
            try {
                try {
                    try {
                        int c = a / b;
                        System.out.println(c);
                    } catch (ArrayIndexOutOfBoundsException a1) {
                        System.out.println("ArrayIndexOutOfBoundsException");
                        System.out.println("Level 1");
                    }
                } catch (IndexOutOfBoundsException a2) {
                    System.out.println("IndexOutOfBoundsException");
                    System.out.println("Level 2");
                }
            } catch (ArithmeticException a3) {
                System.out.println("ArithmeticException");
                System.out.println("Level 3");
            }
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println("Level 4");
        }
    }
}
