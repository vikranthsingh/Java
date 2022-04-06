package SimpliCode;

class OuterClass {
    static int outerStaticVariable = 10;
    int instanceVariable = 20;
    private static int privateStaticVariable = 30;

    static class InnerClass {
        void display() {
            //System.out.println(instanceVariable); doesn't support
            System.out.println("outerStaticVariable " + outerStaticVariable);
            System.out.println("privateStaticVariable : " + privateStaticVariable);
        }
    }
}

public class JavaStaticNestedClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
    }
}
