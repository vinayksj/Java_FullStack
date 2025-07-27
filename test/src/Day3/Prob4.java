package Day3;

import java.util.Scanner;
public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Largest: " + max);
    }
}

