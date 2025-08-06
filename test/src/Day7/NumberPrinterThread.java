package Day7;

public class NumberPrinterThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    try {
                        Thread.sleep(5000); // 5000 milliseconds = 5 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start(); // Start the thread
    }
}