package Day7;

public class EvenOddThreads {
    public static void main(String[] args) {
        // Thread to print even numbers
        Thread evenThread = new Thread(() -> {
            System.out.println("Even Numbers:");
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(i);
            }
        });

        // Thread to print odd numbers
        Thread oddThread = new Thread(() -> {
            System.out.println("Odd Numbers:");
            for (int i = 1; i < 20; i += 2) {
                System.out.println(i);
            }
        });

        // Start even thread first
        evenThread.start();

        try {
            evenThread.join(); // Wait for even thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Then start odd thread
        oddThread.start();
    }
}