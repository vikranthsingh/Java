package SimpliCode;

class Overload{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(double a, double b, double c){
        System.out.println(a+b+c);
    }
    public double sub(double a, double b, double c){
        double result = a-b-c;
        System.out.println(result);
        return result;
    }
}
public class JavaOverLoading {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.add(7, 7);
        overload.add(7, 7, 7);
        overload.add(7.1, 7.2, 7.3);
        overload.sub(24, 18, 12);
    }
}
