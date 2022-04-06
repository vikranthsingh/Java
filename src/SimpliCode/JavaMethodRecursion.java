package SimpliCode;
class Recursion{
  int calculateFactorial(int n){
      if (n == 1){
          return 1;
      }else {
          return (n*calculateFactorial(n-1));
      }
  }
}
public class JavaMethodRecursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int r = recursion.calculateFactorial(5);
        System.out.println(r);
    }
}
