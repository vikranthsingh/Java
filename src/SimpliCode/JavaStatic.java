package SimpliCode;

class Student1 {
    String name;
    int age;
    static String college = "AU";
    static int count = 0;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    static void studentCount(){
        count = count+1;
        System.out.println(count);
    }
}

public class JavaStatic {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Vikranth", 28);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(Student1.college);   //Static variables belongs to Class
        Student1.studentCount();

        Student1 student2 = new Student1("Vikr", 29);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(Student1.college);   //Static variables belongs to Class
        Student1.studentCount();
    }
}
