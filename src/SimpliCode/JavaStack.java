package SimpliCode;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        /*Stack<String> stack = new Stack<>();    //LIFO
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);*/
        Stack<String> name = new Stack<>();
        name.push("V");
        name.push("I");
        name.push("K");
        System.out.println("Top Element : "+name.peek());
        System.out.println("Remove Top Element : "+name.pop());
        System.out.println(name);
    }
}
