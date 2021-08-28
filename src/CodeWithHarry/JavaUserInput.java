package CodeWithHarry;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isTrue = sc.hasNext();
        System.out.println(isTrue);
        System.out.println("Enter the First number : ");
        int num = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();
        int result = num+num2;
        System.out.println("The Addition of First & Second Number is : "+result);
    }
}
