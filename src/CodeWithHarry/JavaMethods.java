package CodeWithHarry;

public class JavaMethods {
    public static void main(String[] args) {
        JavaMethods meth = new JavaMethods();
        System.out.println(meth.div(14, 7));

        int addResult = add(7, 7);
        //System.out.println(addResult);

        int mulResult = mul(7, 7);
        //System.out.println(mulResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
