package SimpliCode;

class Multiply {
    int mul(int x, int y) {
        return x * y;
    }
    int mul(int x, int y, int z) {
        return x * y *z;
    }
    double mul(int x, double y, double z) {
        return x * y *z;
    }
}

public class JavaMethodOverLoading {
    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        double r = multiply.mul(1, 2, 3.1);
        System.out.println(r);
    }
}
