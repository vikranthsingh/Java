package SimpliCode;

class OuterClass1 {
    int outerInstanceVariable = 10;
    static int outerStaticVariable = 12;

    class InnerClass {
        void display() {
            System.out.println("outerInstanceVariable: " + outerInstanceVariable);
            System.out.println("outerStaticVariable: " + outerStaticVariable);
        }
    }
}

public class JavaInnerClass {
    public static void main(String[] args) {
        OuterClass1.InnerClass innerClass = new OuterClass1().new InnerClass();
        innerClass.display();
    }
}
