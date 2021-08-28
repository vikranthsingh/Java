package SimpliCode;

public class JavaArithmeticException {
    public static void main(String[] args) throws ArithmeticException, NullPointerException {
        int x = 100 / 0;
        System.out.println(x);

        String a = null;
        System.out.println(a.charAt(0));
    }
}
