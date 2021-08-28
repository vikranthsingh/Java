package SimpliCode;

import CodeWithHarry.JavaAccessModifiers;

import java.util.Scanner;

import static java.lang.Math.sin;

class Calculator{
    void cal(int a, int b){
        System.out.println("The value of a & b is : "+ a +""+ b);
    }
}
class ScCalculator{
    void cal(int a, int b){
        System.out.println("The value of a & b is : " + a + b);
    }
}
class HyCalculator{
    void cal(int a, int b){
        System.out.println("The value of a & b is : "+ sin(a + b));
        System.out.println("The value of a & b is : "+ a + b);
    }
}
class C2 extends JavaAccessModifiers {
    void meth1() {
        System.out.println(a);
        System.out.println(x);
        //System.out.println(z);
    }
}

public class JavaPractice {
    public static void main(String[] args) {
        //System.out.println("Enter the values : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Value : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Value : ");
        int b = sc.nextInt();
        Calculator calc = new Calculator();
        calc.cal(a, b);
    }
}
