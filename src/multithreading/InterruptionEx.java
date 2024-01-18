package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            if (isInterrupted()) {
                System.out.println("Incercare de a intrerupe thread");
                System.out.println("Ne-am convins ca starea tuturor" +
                        " thread-urilor este in regula si vrem sa inchidem thread");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Se doreste intreruperea threadului in" +
                        " timpul somnului. Inchidem thread");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}