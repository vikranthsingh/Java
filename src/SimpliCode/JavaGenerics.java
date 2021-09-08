package SimpliCode;

public class JavaGenerics<T, U> {
    T obj;
    U obj1;

    public JavaGenerics(T obj, U obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public T getObj() {
        return obj;
    }

    public U getObj1() {
        return obj1;
    }

    public static void main(String[] args) {
        JavaGenerics<Integer, String> javaGenerics = new JavaGenerics<>(10, "Vik");
        System.out.println(javaGenerics.getObj());
        System.out.println(javaGenerics.getObj1());

        JavaGenerics<String, Integer> javaGenerics1 = new JavaGenerics<>("Singh", 28);
        System.out.println(javaGenerics1.getObj());
        System.out.println(javaGenerics1.getObj1());
    }
}
