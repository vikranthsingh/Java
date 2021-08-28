package CodeWithHarry;

class MyThd extends Thread {
    public MyThd(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i<100){
            System.out.println(getName());
            i++;
        }
    }
}

public class JavaThreadClass {
    public static void main(String[] args) {
        MyThd t1 = new MyThd("Extends Thread 1");
        MyThd t2 = new MyThd("Extends Thread 2");
        MyThd t3 = new MyThd("Extends Thread 3");
        MyThd t4 = new MyThd("Extends Thread 4");
        MyThd t5 = new MyThd("Extends Thread 5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        /*System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
        System.out.println(t4.getName());
        System.out.println(t5.getName());*/

        /*System.out.println("The id is : "+t.getId());
        System.out.println("The name is : "+t.getName());*/
    }
}
