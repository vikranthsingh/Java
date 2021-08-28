package CodeWithHarry;

import java.util.ArrayList;
import java.util.List;

public class JavaHandlingSpecificException {
    public static void main(String[] args) {
       try {
           int[] a = {1,2,3};
           System.out.println(a[3]);
       }catch (ArrayIndexOutOfBoundsException a){
           System.out.println("ArrayIndexOutOfBoundsException");
       }catch (IndexOutOfBoundsException i){
           System.out.println("ArithmeticException");
       }catch (ArithmeticException a1){
           System.out.println("ArithmeticException");
       }
       catch (Exception e) {
           System.out.println("Exception");
       }
    }
}
