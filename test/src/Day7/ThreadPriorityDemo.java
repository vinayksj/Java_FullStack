package Day7;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create three threads with different priorities
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("High Priority Thread - " + i);
            }
            System.out.println("High Priority Thread Completed");
        });

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Low Priority Thread - " + i);
            }
            System.out.println("Low Priority Thread Completed");
        });

        Thread normalPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Normal Priority Thread - " + i);
            }
            System.out.println("Normal Priority Thread Completed");
        });

        // Set priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);   // 10
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);    // 1
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY); // 5

        // Start all threads at the same time
        highPriorityThread.start();
        lowPriorityThread.start();
        normalPriorityThread.start();
    }
}