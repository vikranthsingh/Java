package SimpliCode;
class OuterClass1{
    class InnerClass{
        void display(){
            System.out.println("Inner Class Method");
        }
    }
}
public class JavaInnerClass {
    public static void main(String[] args) {
       OuterClass1.InnerClass in = new OuterClass1().new InnerClass();
       in.display();
    }
}
