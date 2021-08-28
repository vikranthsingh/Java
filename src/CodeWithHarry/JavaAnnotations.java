package CodeWithHarry;

class Base5 {
    void name(){
        System.out.println("Vikrant");
    }
}
class Derived5 extends Base5{
    @Override
    void name() {
        System.out.println("Vikranth");
    }
}
@Deprecated
class SumMeth{
    int sum(int a, int b){
        return a+b;
    }
}
public class JavaAnnotations {
    public static void main(String[] args) {
        Derived5 d = new Derived5();
        d.name();

        @SuppressWarnings("deprecation")
        SumMeth sum = new SumMeth();
        int a = sum.sum(5,6);
        System.out.println(a);
    }
}
