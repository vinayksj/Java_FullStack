package day8;

import java.util.*;

public class JumbledWords {

    public static String jumbleWordMethod1(String word) {
        StringBuilder oddForward = new StringBuilder();
        StringBuilder evenBackward = new StringBuilder();

        // Step 1: Pick every odd letter (1st, 3rd, 5th...) from left to right
        for (int i = 0; i < word.length(); i += 2) {
            oddForward.append(word.charAt(i));
        }

        // Step 2: Pick every even letter (2nd, 4th...) from right to left
        for (int i = word.length() - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                evenBackward.append(word.charAt(i));
            }
        }

        return oddForward.toString() + evenBackward.toString();
    }

    public static String jumbleWordMethod2(String word) {
        StringBuilder oddForward = new StringBuilder();
        StringBuilder evenForward = new StringBuilder();

        // Step 1: Pick every odd letter (1st, 3rd, 5th...) from left to right
        for (int i = 0; i < word.length(); i += 2) {
            oddForward.append(word.charAt(i));
        }

        // Step 2: Pick every even letter (2nd, 4th...) from left to right
        for (int i = 1; i < word.length(); i += 2) {
            evenForward.append(word.charAt(i));
        }

        return oddForward.toString() + evenForward.toString();
    }

    public static String JumbledWords(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (input2 == 1) {
                result.append(jumbleWordMethod1(word));
            } else if (input2 == 2) {
                result.append(jumbleWordMethod2(word));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter method (1 or 2):");
        int method = sc.nextInt();

        String jumbledSentence = JumbledWords(sentence, method);
        System.out.println("Jumbled Sentence: " + jumbledSentence);
    }
}