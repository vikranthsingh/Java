package CodeWithHarry;
class C1{
    public int x = 10;
    private int y = 20;
    int z = 30;
    protected int a = 40;
    void meth(){
        System.out.println("The value of y : " + y);
    }
}
public class JavaAccessModifiers {
    protected int a = 40;
    public int x = 10;
    int z = 30;
    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println("The value of a : " + c.a);
        System.out.println("The value of x : " + c.x);
        c.meth();
        System.out.println("The value of z : " + c.z);
    }
}
