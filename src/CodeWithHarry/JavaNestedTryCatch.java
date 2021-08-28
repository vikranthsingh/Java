package CodeWithHarry;

public class JavaNestedTryCatch {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 0;
        x[1] = 1;
        x[2] = 2;
        try {
            System.out.println("Level One");
            try {
                System.out.println(x[3]);
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }catch (ArrayIndexOutOfBoundsException a1){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
