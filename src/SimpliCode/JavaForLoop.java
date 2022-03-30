package SimpliCode;

public class JavaForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i+=2) {
            //initialization condition increment
            if (i == 8){
                continue;
            }
            System.out.println("Hi "+i);
        }
    }
}
