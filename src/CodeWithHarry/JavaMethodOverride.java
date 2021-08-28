package CodeWithHarry;
class Base1 {
    void name(){
        System.out.println("My name is Veeru");
    }
}
class Derived1 extends Base1{
    @Override
    void name() {
        System.out.println("My name is Vikranth");
    }
}
public class JavaMethodOverride {
    public static void main(String[] args) {
        Derived1 derived = new Derived1();
        derived.name();
    }
}
