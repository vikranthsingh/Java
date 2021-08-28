package CodeWithHarry;
class MyGenerics<T1, T2>{
    int v;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int v, T1 t1, T2 t2) {
        this.v = v;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class JavaGenerics {
    public static void main(String[] args) {
        MyGenerics<String, Character> generics = new MyGenerics<>(57, "Vikranth", 'S');
        System.out.println(generics.getT1());
        System.out.println(generics.getT2());
        System.out.println(generics.v);
    }
}
