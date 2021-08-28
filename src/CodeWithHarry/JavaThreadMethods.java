package CodeWithHarry;

class MyThread4 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println("Vikranth");
            i++;
        }
    }
}
class MyThread5 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Singh");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class JavaThreadMethods {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread5 t2 = new MyThread5();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
