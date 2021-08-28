package SimpliCode;
class Add{
    int add(int a, int b){
        int result = a + b;
        return result;
    }
}
public class JavaMethod {
    public static void main(String[] args) {
        Add addResult = new Add();
        int a = addResult.add(7,7);
        System.out.println(a);
    }
}
