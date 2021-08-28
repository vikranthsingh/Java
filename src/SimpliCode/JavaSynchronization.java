package SimpliCode;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(2 * i);
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    synchronized public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(3 * i);
        }
    }
}

public class JavaSynchronization {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        Thread thread = new Thread(new MyThread2());
        thread.start();
    }
}
