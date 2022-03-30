package SimpliCode;

public class JavaIfElse {
    public static void main(String[] args) {
        int marks = 69;
        char a;
        if (marks >= 90){
            a = 'A';
        }else if (marks >= 80){
            a = 'B';
        }else if (marks >= 70){
            a = 'C';
        }else {
            a = 'F';
        }
        System.out.println("Grade " + a);

    }
}
