package SimpliCode;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread Running");
    }
}

class yourThread implements Runnable {

    @Override
    public void run() {
        System.out.println("yourThread Running");
    }
}

public class JavaThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            Thread thread = new Thread(new yourThread());
            myThread.start();
            thread.start();
        }
    }
}
