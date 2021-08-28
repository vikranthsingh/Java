package SimpliCode;

public class JavaClass {
    String name;
    int age;
    static String college_name = "AU";

    public JavaClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getCollege_name() {
        return college_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        JavaClass name = new JavaClass("Vikranth", 28);
        System.out.println(name.getName());
        System.out.println(name.getAge());
        System.out.println(getCollege_name());
    }
}
