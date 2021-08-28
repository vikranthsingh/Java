package CodeWithHarry;

interface Anonymous{
    void run();
}
interface LambdaExpressions{
    void run();
}
public class JavaAnonymousClasses {
    public static void main(String[] args) {
        Anonymous a = new Anonymous() {
            @Override
            public void run() {
                System.out.println("JavaAnonymousClasses");
            }
        };
        a.run();

        //LambdaExpressions
        LambdaExpressions a1 = ()->{
            System.out.println("Lambda Expression");
        };
        a1.run();
    }
}
