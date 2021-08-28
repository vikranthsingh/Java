package SimpliCode;

public class DataConversion {
    public static void main(String[] args) {
        int a = 100;
        long l = a;
        System.out.println(l);

        float f = 102.02f;
        double d = f;
        System.out.println(d);

        long l1= 1000;
        int i1 = (int)l1; //typecasting
        System.out.println("int : "+i1);
    }
}
