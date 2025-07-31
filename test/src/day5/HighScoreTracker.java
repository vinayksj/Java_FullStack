package day5;


import java.util.ArrayList;
import java.util.Scanner;

public class HighScoreTracker {
    private static final int MAX_SCORES = 10;
    private ArrayList<Integer> highScores;

    public HighScoreTracker() {
        highScores = new ArrayList<>();
    }

    public void addScore(int score) {
        // Find the correct position to insert (descending order)
        int index = 0;
        while (index < highScores.size() && score < highScores.get(index)) {
            index++;
        }
        highScores.add(index, score);

        // Remove lowest if size exceeds 10
        if (highScores.size() > MAX_SCORES) {
            highScores.remove(highScores.size() - 1);
        }
    }

    public void displayScores() {
        System.out.println("Top Scores:");
        for (int i = 0; i < highScores.size(); i++) {
            System.out.println((i + 1) + ". " + highScores.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HighScoreTracker tracker = new HighScoreTracker();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add new score");
            System.out.println("2. Display top scores");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter new score: ");
                    int score = scanner.nextInt();
                    tracker.addScore(score);
                    break;
                case 2:
                    tracker.displayScores();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}