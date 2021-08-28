package SimpliCode;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class JavaEncapsulation {
    public static void main(String[] args) {
        Student student = new Student("Vikranth", 27);
        System.out.println(student.getName());
        student.setName("Vikranth singh");
        System.out.println(student.getName());
    }
}
