package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
new Person("Elena", callBox);
new Person("Andrei", callBox);
new Person("Tudor", callBox);
new Person("Ana", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run() {
        try {
            System.out.println(name + " asteapta...");
            callBox.acquire();
            System.out.println(name + " se foloseste de telefon");
            sleep(2000);
            System.out.println(name + " a terminat apelul");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
