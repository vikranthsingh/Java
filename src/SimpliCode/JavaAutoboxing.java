package SimpliCode;

public class JavaAutoboxing {
    public static void main(String[] args) {
        int i = 10;
        Integer obj = Integer.valueOf(i);
        System.out.println(obj);

        int j = obj;
        System.out.println(j);

        Character c = 'C';
        char ch = c;
        System.out.println(ch);
    }
}
