package SimpliCode;

public class JavaStudent {
    String name;
    int age;

    public JavaStudent(String name) {
        this.name = name;
        this.age = 21;
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
        JavaStudent s1 = new JavaStudent("Vikranth");
        JavaStudent s2 = new JavaStudent("singh");
        System.out.println(s1.getName());
        System.out.println(s2.getAge());
    }
}
