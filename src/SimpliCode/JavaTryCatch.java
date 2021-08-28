package SimpliCode;


import java.util.ArrayList;
import java.util.List;

public class JavaTryCatch {
    public static void main(String[] args) {
       /* try {
//            int[] arr = {1, 2, 3};
//            System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException
            List<Integer> li = new ArrayList<>();
            li.add(1);          //IndexOutOfBoundsException
            System.out.println(li.get(1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("IndexOutOfBoundsException : " + e1.getMessage());
        } finally {
            System.out.println("This is Executed");
        }*/

        //
        try {
            try {
                try {
                    int[] a = {1, 2, 3};
                    System.out.println(a[3]);
                } catch (NullPointerException e) {
                    System.out.println("IndexOutOfBoundsException");
                    throw e;
                }
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
                throw e;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Executed");
        }
    }
}
