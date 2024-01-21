package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox);this.name =

    name {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        System.out.println(name + "asteapta");
        try {
            callBox.acquire();
            System.out.println(name + "se foloseste de telefon");
            sleep(20000);
            System.out.println(name + "a terminat apelul");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
