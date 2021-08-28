package SimpliCode;

abstract class Parent {
    abstract void name();

    public Parent() {
        System.out.println("Parent Class");     //this constructor is invoked with childClass Constructor
    }
}

class Child extends Parent {

    @Override
    void name() {
        System.out.println("Vikranth");
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {
        //Parent abstract class ref
        Parent child = new Child(); //concrete class object
        child.name();   //method from child class will be called
    }
}
