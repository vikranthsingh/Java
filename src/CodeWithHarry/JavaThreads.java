package CodeWithHarry;

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<100) {
            System.out.println("MyThread");
            System.out.println("Vikranth");
            i++;
        }
    }
}
class MyThread3 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<100) {
            System.out.println("Singh");
            System.out.println("Rajput");
            i++;
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread2");
    }
}

public class JavaThreads {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        MyThread3 t3 = new MyThread3();
        t3.start();
        //Thread thread2 = new Thread(new MyThread2());
        //thread2.start();
    }
}
