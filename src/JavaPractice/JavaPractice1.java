package JavaPractice;
class Student{
    String name;
    String college;
    int age;

    public Student(String name, String college, int age) {
        this.name = name;
        this.college = college;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
public class JavaPractice1 {
    public static void main(String[] args) {
        Student vik = new Student("Vikranth", "AU", 28);
        System.out.println(vik.getName());
        changeName(vik);
        System.out.println(vik.getName());
    }
    public static void changeName(Student student){
        student.setName("VikranthSingh");
    }
}
