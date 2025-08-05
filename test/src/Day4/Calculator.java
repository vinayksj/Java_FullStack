import java.util.ArrayList;
import java.util.Collections;

public class HighScoreTracker {
    private static final int MAX_SCORES = 10;
    private ArrayList<Integer> scores;

    public HighScoreTracker() {
        scores = new ArrayList<>();
    }

    // Add a new score
    public void addScore(int score) {
        // Insert score
        scores.add(score);
        // Sort in descending order
        Collections.sort(scores, Collections.reverseOrder());

        // Remove lowest if list exceeds max size
        if (scores.size() > MAX_SCORES) {
            scores.remove(scores.size() - 1);
        }
    }

    // Display all scores
    public void displayScores() {
        System.out.println("Top Scores:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println((i + 1) + ". " + scores.get(i));
        }
    }

    public static void main(String[] args) {
        HighScoreTracker tracker = new HighScoreTracker();

        tracker.addScore(100);
        tracker.addScore(80);
        tracker.addScore(120);
        tracker.addScore(90);
        tracker.addScore(70);
        tracker.addScore(150);
        tracker.addScore(130);
        tracker.addScore(85);
        tracker.addScore(95);
        tracker.addScore(110);
        tracker.addScore(105); // Will replace lowest if needed

        tracker.displayScores();
    }
}
