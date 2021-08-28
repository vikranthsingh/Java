package CodeWithHarry;

import java.util.Scanner;

public class Java_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Subject marks : ");
        int m1 = scanner.nextInt();
        System.out.println("Enter Second Subject marks : ");
        int m2 = scanner.nextInt();
        System.out.println("Enter Third Subject marks : ");
        int m3 = scanner.nextInt();

        int result = m1+m2+m3;
        System.out.println("The total Marks Obtained : " + result);

        float avg = (result/300.0f)*100;
        System.out.println("The Total Average is " + avg);
    }
}
