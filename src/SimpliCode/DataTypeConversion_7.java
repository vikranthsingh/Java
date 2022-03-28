package SimpliCode;

public class DataTypeConversion_7 {
    public static void main(String[] args) {
        /*//implicit datatype casting/conversion
        int a = 777;
        long l = a;
        //System.out.println("The value of implicit is: " + l);

        //explicit datatype casting/conversion
        double d = 50.50;
        float f = (float) d; //first typecast to double value to float
        long l1 = (long) d;
        int i = (int) f;
        System.out.println("the value of float is: "+f);
        System.out.println("the value of int is: "+i);
        System.out.println("the value of long is: "+l1);*/


        //implicit datatype casting/conversion
        int a = 100;
        long b = a;
        float c = b;
        System.out.println(c);

        //explicit datatype casting/conversion
        double d = 100.50;
        long e = (long) d;
        System.out.println(e);
    }
}
