package day6;


import java.util.Random;

public class ColourDisplay implements Runnable {

    // Array of colours
    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
    
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int index = random.nextInt(colours.length); // Generate random index
            String colour = colours[index];
            System.out.println("Colour: " + colour);

            if (colour.equals("red")) {
                System.out.println("Red found! Stopping the display.");
                break;
            }

            try {
                Thread.sleep(500); // Just to slow down the output (optional)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Main method to start the thread
    public static void main(String[] args) {
        ColourDisplay displayTask = new ColourDisplay();
        Thread thread = new Thread(displayTask);
        thread.start();
    }
}
