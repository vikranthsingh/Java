package JavaPractice;

class MyThread1 extends Thread {
   /* public MyThread1(String name) {
        super(name);
    }*/

    @Override
    public void run() {
        int i = 1;
        while (i < 5) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (i < 5 ){
            System.out.println("Welcome" + this.getState());
            /*try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            i++;
        }

    }
}
/*class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable");
    }
}*/

public class JavaThreads {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getState());


        /*MyThread1 thread2 = new MyThread1("Vikranth2");
        MyThread1 thread3 = new MyThread1("Vikranth3");
        MyThread1 thread4 = new MyThread1("Vikranth4 + Important Thread");
        thread1.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread3.start();
        thread3.setPriority(Thread.NORM_PRIORITY);
        thread4.start();
        thread4.setPriority(Thread.MAX_PRIORITY);*/



        /*String s = thread1.getName();
        System.out.println(s);
        System.out.println(thread1.getId());
        Thread threadR = new Thread(new MyThread2());
        thread2.setName("Thread 2 name is : \t Singh");
        System.out.println(thread2.getName());
        threadR.start();*/
    }
}
