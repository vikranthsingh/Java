package SimpliCode;

interface MyDad {
    abstract void name();
}

interface MyMom {
    abstract void name();
}

class Family {
    void all() {
        System.out.println("Stay Together");
    }
}

class MyClass extends Family implements MyDad, MyMom {

    @Override
    public void name() {
        System.out.println("Cp Singh");
    }
}

public class JavaMultipleInheritance {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.all();
        myClass.name();
    }
}
