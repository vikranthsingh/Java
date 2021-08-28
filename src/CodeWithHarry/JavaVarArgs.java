package CodeWithHarry;

public class JavaVarArgs {
    /*static int sum(int... arr) {
        int result = 0;
        for (int a : arr
        ) {
            result += a;
        }
        return result;
    }*/
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr
             ) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4));
    }
}
