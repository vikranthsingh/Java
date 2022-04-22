package SimpliCode;

class MyThread extends Thread {
    MathUtil mu;

    public MyThread(MathUtil mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        //System.out.println("Thread 1");
        try {
            mu.getMultiple(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class yourThread implements Runnable {
    MathUtil mu;

    public yourThread(MathUtil mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        //System.out.println("Thread 2");
        try {
            mu.getMultiple(3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MathUtil {
     void getMultiple(int n) {
        synchronized (this){
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                /*try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }*/
            }
        }
    }
}

public class JavaThread {
    public static void main(String[] args) {
        //MathUtil obj = new MathUtil();
        MyThread myThread = new MyThread(new MathUtil());
        Thread thread = new Thread(new yourThread(new MathUtil()));
        myThread.start();
        thread.start();
    }
}
