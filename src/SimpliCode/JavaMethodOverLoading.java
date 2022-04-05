package SimpliCode;

class Multiply {
    int calculation(int x, int y) {
        return x + y;
    }

    int calculation(int x, int y, int z) {
        return x + y + z;
    }

    double calculation(double x, double y) {
        return x * y;
    }
}

public class JavaMethodOverLoading {
    public static void main(String[] args) {
        Multiply cal = new Multiply();
        System.out.println(cal.calculation(3,3));
        System.out.println(cal.calculation(3,4,5));
        System.out.println(cal.calculation(3.4,4.3));
    }
}
