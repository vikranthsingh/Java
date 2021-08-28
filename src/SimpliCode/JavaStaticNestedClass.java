package SimpliCode;

class OuterClass {
   static int num1 = 1;
   private static int num2 = 2;
   int num3 = 3;

   static class InnerClass{
       void print(){
           System.out.println(num1);
           System.out.println(num2);
           //System.out.println(num3); //its not static member
       }
   }
}

public class JavaStaticNestedClass {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.print();
    }
}
