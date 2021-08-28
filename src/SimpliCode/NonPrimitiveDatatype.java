package SimpliCode;

public class NonPrimitiveDatatype {
    public static void main(String[] args) {

        //String = String is a continuous sequence of characters.
        String s = new String("Vikranth");
        System.out.println(s);

        String s1 = "Vikranth";
        System.out.println(s1);

        //Array is a continuous sequence of Elements (can store anything)
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        System.out.println(arr[0]);

        int[] arr1;
        arr1 = new int[3];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        System.out.println(arr1[1]);

        int[] arr2 = {0,1,2};
        System.out.println(arr2[2]);
    }
}
