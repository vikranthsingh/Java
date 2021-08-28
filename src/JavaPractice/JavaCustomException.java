package JavaPractice;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "ToString";
    }

    @Override
    public String getMessage() {
        return "Error";
    }
}

public class JavaCustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the value : ");
        /*int a = sc.nextInt();
        if (a < 9 ){
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }*/
        int a = 7;
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        if (b == 0){
            throw new ArithmeticException("Cannot divide by 0");
        }else {
            int c = a/b;
            System.out.println(c);
        }
    }
}
