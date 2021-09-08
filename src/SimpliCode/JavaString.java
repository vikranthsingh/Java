package SimpliCode;

public class JavaString {
    private String str1 = "Vikranth";
    private String str2 = "Singh";
    public static void main(String[] args) {
        JavaString string = new JavaString();
        System.out.println(string.str1.length());
        System.out.println(string.str1+" "+string.str2);
        System.out.format("My name is %s "+ " and I have %d bike", "Vikranth", 1);
        System.out.println();
        System.out.println(string.str1.charAt(0));
        System.out.println(string.str1.equals(string.str2));
        System.out.println(string.str1.indexOf('i'));
        System.out.println(string.str1.replace('i', 'I'));
        System.out.println(string.str1.lastIndexOf('g')); //could find 'g' so it -1
        System.out.println(string.str1.substring(0, 3));
    }
}