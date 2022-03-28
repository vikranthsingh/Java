package SimpliCode;

public class Java1DArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        //System.out.println(a[1]);
        //One Dimension Array
        int[] arr = new int[4];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);
        //System.out.println(arr[3]);

        //Two Dimension Array
        //1st row 2nd row 3rd row
        int[][] ar = {{2, 7, 9, 4}, {3, 6, 1}, {7, 4, 2, 9}, {1, 2, 3}, {4, 10, 5, 6}};
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        int[] a1;
        a1 = new int[3];
        int[] b = new int[3];
        b[0] = 1;
        b[1] = 2;
        int[] c = {1,2,3};
    }
}
