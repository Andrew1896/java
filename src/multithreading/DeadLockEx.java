package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
thread10.start();
thread20.start();

    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Incercarea de a acapara monitorul obiectului lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: Monitorul obiectului loch1 a fost acaparet");
            System.out.println("Thread10: Incercarea de a acapara monitorul obiectului lock1");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: Monitorul obiectului lock2 a fost acaparet");

            }
        }
    }
}
class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Incercarea de a acapara monitorul obiectului lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread20: Monitorul obiectului lock2 a fost acaparet");
            System.out.println("Thread20: Incercarea de a acapara monitorul obiectului lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread20: Monitorul obiectului lock1 a fost acaparet");

            }
        }
    }
}