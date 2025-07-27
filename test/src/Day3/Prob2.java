package Day3;

import java.util.Scanner;
public class Prob2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0));
	        System.out.println("a > 0 || b < 0: " + (a > 0 || b < 0));
	        System.out.println("!(a > 0): " + !(a > 0));
	    }

}