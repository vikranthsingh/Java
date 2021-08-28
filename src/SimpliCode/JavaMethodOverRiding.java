package SimpliCode;

class Parent3 {
    static int age = 28;
    public static void son() {
        System.out.println("Get married");
    }
    public void say(){
        System.out.println("Saying");
    }
}

class Child3 extends Parent3 {
    @Override
    public void say() {
        System.out.println("Don't want to Speak");
    }
}

public class JavaMethodOverRiding {
    public static void main(String[] args) {
        Parent3.son();                      //Static method is called by ClassName.StaticMethodName
        System.out.println(Parent3.age);    //Static variable is called by ClassName.StaticVariableName


        Child3 child = new Child3();
        child.say();    //Instance method because it belongs to Object
    }
}
