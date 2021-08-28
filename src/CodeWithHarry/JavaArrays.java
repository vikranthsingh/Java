package CodeWithHarry;

public class JavaArrays {
    public static void main(String[] args) {
        //Type 1
        int[] a1; //declare
        a1 = new int[5]; //memory allocation

        //Type 2
        int[] a2 = new int[4]; //declare and memory allocation

        //Type 3
        int[] a3 = new int[3]; //declare and initialization

        int[] a4 = {90,80,70,60,50,40}; //length is 6 and index is (length-1) 5 because index start with 0;
        //System.out.println(a4.length);
        //For Each or Enhanced for loop
        for (int a6 : a4
             ) {
            //System.out.println(a6);
        }

        //For Loop
        for (int i = a4.length-1; i >=0; i--) {
            System.out.println(a4[i]);
        }

        float[] a5 = {90,80,70,60,50}; //length is 5 and index is (length-1) 4 because index start with 0;
        //System.out.println(a5[2]);

        String[] names = {"Vikranth", "Singh", "Rajput"};
        //System.out.println(names[0]);
    }
}
