package multithreading;

public class Ex10 {
    public static void main(String[] args) {
        MyRunnableImpl1 runable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runable);
        Thread thread2 = new Thread(runable);
        Thread thread3 = new Thread(runable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImpl1 implements Runnable {
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            increment();
        }
    }
}