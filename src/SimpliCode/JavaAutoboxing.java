package SimpliCode;

public class JavaAutoboxing {
    public static void main(String[] args) {
        //Auto_Box
        /*int i = 10;
        Integer i1 = Integer.valueOf(i); //converting primitive datatype to Object Wrapper Class
        System.out.println(i1);

        //Auto_UnBox
        int i3 = i1;
        System.out.println(i3);

        double a = 20.12;
        Double d = Double.valueOf(a); //converting primitive datatype to Object Wrapper Class
        System.out.println(d);*/

        int k = 10;
        Integer obj = Integer.valueOf(k);
        System.out.println("autobox "+obj);

        int j = obj;
        System.out.println("auto-unbox "+j);

        char ch = 'c';
        Character character = Character.valueOf(ch);
        System.out.println(character);
    }
}
