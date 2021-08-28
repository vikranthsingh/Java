package JavaPractice;

import java.util.Scanner;

public class JavaTryCatchBlock {
    public static void main(String[] args) {
        /*int a = 100;
        int b = 0;
        int c = 0;*/
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Up no : ");
        int up = sc.nextInt();
        System.out.println("Enter the down no : ");
        int down = sc.nextInt();

        try {
            int up1 = marks[up];
            int down1 = marks[up]/down;
            System.out.println("The Number at given index is :  " + up1);
            System.out.println("The value after division is : "+ down1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e1){
            System.out.println("IndexOutOfBoundsException");
        }catch (ArithmeticException e2){
            System.out.println("ArithmeticException");
        }
    }
}
