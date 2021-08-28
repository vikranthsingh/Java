package SimpliCode;

class ParentClass1{
    public ParentClass1() {
        System.out.println("ParentClass Constructor");
    }
    public ParentClass1(int a) {
        System.out.println("ParentClass Overloaded Constructor " + a);
    }
}
class ChildClass1 extends ParentClass1{
    ChildClass1(){
        super(7);
        System.out.println("ChildClass Constructor");
    }
}
public class JavaConstructor_Inheritance {
    public static void main(String[] args) {
        ChildClass1 child = new ChildClass1();
    }
}
