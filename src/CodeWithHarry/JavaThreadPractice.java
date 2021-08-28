package CodeWithHarry;

class Threads extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good morning : " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Threads1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome : " + i);
        }
    }
}

public class JavaThreadPractice {
    public static void main(String[] args) {
        Threads threads = new Threads();
        Threads1 threads1 = new Threads1();
        threads1.start();
        try {
            threads1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threads.start();
        System.out.println(threads.getState());
        threads1.setPriority(Thread.MAX_PRIORITY);
        threads.setPriority(Thread.MIN_PRIORITY);


    }
}
