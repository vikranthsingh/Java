package SimpliCode;

interface ParentClasss {
    abstract void name();
    abstract void display();
}

class ChildClasss implements ParentClasss {

    @Override
    public void name() {
        System.out.println("Hi");
    }

    @Override
    public void display() {
        System.out.println("Displaying");
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        ParentClasss child = new ChildClasss();
        child.name();
        child.display();

        ParentClasss cls = new ParentClasss() { //Anonymous Class
            @Override
            public void name() {
                System.out.println("name");
            }

            @Override
            public void display() {
                System.out.println("display");
            }
        };
        cls.display();
        cls.name();
    }
}
