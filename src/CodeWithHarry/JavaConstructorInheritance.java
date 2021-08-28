package CodeWithHarry;

class Base {
    int x;

    public Base() {
        System.out.println("Im a Base Class Constructor");
    }

    public Base(int x) {
        System.out.println("Im a Base Class Constructor with value of x as: " + x);
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends Base {
    int y;

    public Derived() {
        System.out.println("Im a Derived Class Constructor");
    }

    public Derived(int x, int y) {
        super(x);
        System.out.println("Im a Derived Class Constructor with value of y as: " + y);
        this.y = y;
    }
}

public class JavaConstructorInheritance {
    public static void main(String[] args) {
        //Base base = new Base();
        Derived derived = new Derived(7,8);
        //Derived derived = new Derived();
    }
}
