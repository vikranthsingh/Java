package CodeWithHarry;

public class JavaString {
    public static void main(String[] args) {
        String name = new String("Vik"); //creating object everytime its invoked
        System.out.println(name);

        String lname = "Singh";     //reusing the object
        System.out.println(lname);
        System.out.print("Print with out nextLine");

        System.out.println();
        int a = 7;
        float f = 6.5f;
        System.out.printf("The value of a is : %d and f is : %8.2f ",a,f); //8 space and two digits after decimal
        System.out.println();
        System.out.format("The value of a is : %d and f is : %8.3f ",a,f);

    }
}
