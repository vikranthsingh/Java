package SimpliCode;

abstract class Parent {
    abstract void name();

    abstract void action();

    void talking() {
        System.out.println("Talking over phone");
    }
}

class childClass extends Parent {

    @Override
    void name() {
        System.out.println("Vik");
    }

    @Override
    void action() {
        System.out.println("Biking");
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {
        //Parent abstract class ref
        //concrete class object
        //method from child class will be called
        Parent child = new childClass();
        child.name();
        child.action();
        child.talking();
    }
}
