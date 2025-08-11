package day8;

import java.util.*;

public class FixTheFormula {

    public static int fixTheFormula(String input1) {
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        // Separate numbers and operators
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }

        // Start with the first number
        int result = numbers.get(0);

        // Apply each operator to the running result
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int nextNum = numbers.get(i + 1);

            switch (op) {
                case '+':
                    result += nextNum;
                    break;
                case '-':
                    result -= nextNum;
                    break;
                case '*':
                    result *= nextNum;
                    break;
                case '/':
                    result /= nextNum;
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the tricky string:");
        String str = sc.nextLine();

        int answer = fixTheFormula(str);
        System.out.println("Final Answer: " + answer);
    }
}