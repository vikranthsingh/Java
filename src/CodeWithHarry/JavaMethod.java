package CodeWithHarry;

class Meth {
    int add(int a, int b) {
        int x = a + b;
        return x;
    }

    int sub(int a, int b, int c) {
        int y = a - b + c;
        return y;
    }

    int mul(long a, int b, int c) {
        int z = (int) a * b * c;
        return z;
    }
}

public class JavaMethod {
    public static void main(String[] args) {
        Meth mth = new Meth();
        int r1 = mth.add(7, 7);
        System.out.println(r1);

        int r2 = mth.sub(7, 7, 7);
        System.out.println(r2);

        int r3 = mth.mul(7, 7,1);
        System.out.println(r3);
    }
}
