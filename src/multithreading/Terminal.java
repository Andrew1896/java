package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Terminal {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Andrei", lock);
        new Employee("Maxim", lock);
        new Employee("Artur", lock);
        Thread.sleep(4000);
        new Employee("Alexa", lock);
        new Employee("Irina", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " asteapta...");
//            lock.lock();
                System.out.println(name + " se foloseste de terminal");
                sleep(2000);
                System.out.println(name + " a terminat actiunile la terminal");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " nu doreste sa astepte rindul");
        }
    }
}