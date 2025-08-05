package day6;

public class ThreadNamesExample {
    public static void main(String[] args) {
        // Create first thread named "Scooby"
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }, "Scooby");

        // Create second thread named "Shaggy"
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }, "Shaggy");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

