package multithreading;

public class Ex12 {
    void mobileCall() throws InterruptedException {
        System.out.println("Mobile call starts");
        Thread.sleep(1000);
        System.out.println("Mobile call ends");
    }

    void skypeCall() throws InterruptedException {
        System.out.println("Skype call starts");
        Thread.sleep(1000);
        System.out.println("Skype call ends");
    }
    void whatsappCall() throws InterruptedException {
        System.out.println("Whatsapp call starts");
        Thread.sleep(1000);
        System.out.println("Whatsapp call ends");
    }
}
class RunnableImplMobile1 implements Runnable {
    public void run() {
        System.out.println("Ura!");
    }
}