package SimpliCode;

class ParentClass {
  protected int age;
  protected String name;

    public ParentClass(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
class ChildClass extends ParentClass{

    public ChildClass(int age, String name) {
        super(age, name);
    }
}
public class JavaInheritance {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass(64, "Cp Singh");
        System.out.println(parentClass.name);
        ChildClass childClass = new ChildClass(27, "Vikranth");
        System.out.println(childClass.name);
    }
}
