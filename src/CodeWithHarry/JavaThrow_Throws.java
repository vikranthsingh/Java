package CodeWithHarry;

public class JavaThrow_Throws {
    public static int div(int a, int b) throws ArithmeticException {
        int res = a / b;
        return res;
    }

    public static void main(String[] args) {
        try {
            int c = div(6, 0);
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
