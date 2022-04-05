package SimpliCode;

class Student{
   String name;
   int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
public class JavaEncapsulation {
    public static void main(String[] args) {
       Student student1 = new Student("vikranth singh", 29);
       student1.setName("Vik");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
    }
}
