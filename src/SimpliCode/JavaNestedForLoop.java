package SimpliCode;

public class JavaNestedForLoop {
    public static void main(String[] args) {
      int[][] a = {{1,2,3,4,5,6},{4,5,6},{7,8,9}};
      //int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] b : a
             ) {
            for (int c : b
                 ) {
                System.out.print(c + " ");
            }
        }
    }
}
