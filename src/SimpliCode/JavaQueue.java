package SimpliCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
