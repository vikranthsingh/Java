package JavaPractice;

public class JavaThrowsThrow {
    static float area(int a) {
        if (a < 0) {
            try {
                throw new Exception("Cannot b less then 1");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
        return a * a;
    }

    static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        /*try {
            int x = div(7, 0);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }*/
        float f = area(0);
        System.out.println(f);
    }
}
