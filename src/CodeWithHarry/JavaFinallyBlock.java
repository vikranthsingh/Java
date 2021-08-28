package CodeWithHarry;

public class JavaFinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException a){
            System.out.println("ArithmeticException");
        }finally {
            System.out.println("End of Program");
        }
    }
}
