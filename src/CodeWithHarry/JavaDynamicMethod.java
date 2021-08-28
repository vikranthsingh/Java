package CodeWithHarry;
class Base2{
    void run(){
        System.out.println("Im Running...");
    }
    void walk(){
        System.out.println("Im Walking");
    }
}
class Derived2 extends Base2{
    void Cycle(){
        System.out.println("Im Cycling...");
    }

    @Override
    void run() {
        System.out.println("Im Running in Derived Class...");
    }
}
public class JavaDynamicMethod {
    public static void main(String[] args) {
        Base2 base = new Derived2();
        base.run();
        base.walk();
    }
}
