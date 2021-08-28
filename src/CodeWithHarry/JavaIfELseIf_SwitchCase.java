package CodeWithHarry;

import java.util.Scanner;

public class JavaIfELseIf_SwitchCase {
    public static void main(String[] args) {
        int age = 17;
        int drivingLicence = 17;
        if (age >= 18 ){
            System.out.println("Legal");
        }else if (drivingLicence >= 18){
            System.out.println("Can Drive");
        }else {
            System.out.println("Minor");
        }

        System.out.println("Enter the numb : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> System.out.println("The value is : A");
            case 2 -> System.out.println("The value is : B");
            case 3 -> System.out.println("The value is : C");
            default -> System.out.println("None");
        }
    }
}
