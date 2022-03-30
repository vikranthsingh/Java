package SimpliCode;

public class JavaUnaryOperator {
    public static void main(String[] args) {
        /*int a = 1;
        System.out.println(a); //1
        a++;
        System.out.println(a); //2
        ++a;
        System.out.println(a); //3
        a--;
        System.out.println(a); //2
        --a;
        System.out.println(a); //1

        boolean isTrue = true;
        System.out.println(isTrue);
        System.out.println(!isTrue);*/

        int a = 1;
        System.out.println(a); //1
        System.out.println(a++); //1
        System.out.println(a); //2

        System.out.println(++a); //3
        System.out.println(a); //3

        System.out.println(a--); //3
        System.out.println(a); //2

        System.out.println(--a); //1
        System.out.println(a);  //1

        boolean isTrue = true;
        System.out.println(isTrue);
        System.out.println(!isTrue);
    }
}
