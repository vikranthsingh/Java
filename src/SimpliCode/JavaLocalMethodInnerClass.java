package SimpliCode;

class OuterClass3{
    class InnerClass{
        void localMethod(){
            System.out.println("localMethod");
            class LocalMethodInnerClass{
                void display(){
                    System.out.println("LocalMethodInnerClass");
                }
            }
            LocalMethodInnerClass cl = new LocalMethodInnerClass();
            cl.display();
        }
    }
}
public class JavaLocalMethodInnerClass {
    public static void main(String[] args) {
        OuterClass3.InnerClass cl = new OuterClass3().new InnerClass();
        cl.localMethod();
    }
}
