package SimpliCode;

public class JavaDataTypeConversion {
    public static void main(String[] args) {
        //implicit datatype casting/conversion
        int a = 777;
        long l = a;
        System.out.println("The value of implicit is: " + l);

        //explicit datatype casting/conversion
        double d = 50.50;
        float f = (float) d; //first typecast to double value to float
        long l1 = 1234567891L;
        int i = (int) l1;
        System.out.println("the value of float is: "+f);
        System.out.println("the value of int is: "+ i);
    }
}
