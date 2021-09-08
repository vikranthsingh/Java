package SimpliCode;

public class JavaAutoboxing {
    public static void main(String[] args) {
        //Auto_Box
        int i = 10;
        Integer i1 = Integer.valueOf(i); //converting primitive datatype to Object Wrapper Class
        System.out.println(i1);

        //Auto_UnBox
        int i3 = i1;
        System.out.println(i3);

        double a = 20.12;
        Double d = Double.valueOf(a); //converting primitive datatype to Object Wrapper Class
        System.out.println(d);
    }
}
