package SimpliCode;

public class JavaTernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        if (a < 12)
            System.out.println("morning");

        String noon = a < 12 ? "morning" : "afternoon";
        System.out.println(noon);
    }
}
