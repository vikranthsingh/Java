package SimpliCode;

public class NonPrimitive_5 {
    public static void main(String[] args) {
        String s = new String("String"); //creating object everytime
        System.out.println(s);

        String s1 = "String"; //reusing the string
        System.out.println(s1);

        int[] arr;
        arr = new int[4];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        System.out.println(arr[3]);
    }
}
