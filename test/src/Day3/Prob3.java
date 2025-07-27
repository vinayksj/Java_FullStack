package Day3;


import java.util.Scanner;

public class Prob3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();
	        System.out.println("Pre-increment: " + (++a));
	        System.out.println("Post-increment: " + (a++));
	        System.out.println("After Post-increment: " + a);
	        System.out.println("Pre-decrement: " + (--a));
	        System.out.println("Post-decrement: " + (a--));
	        System.out.println("After Post-decrement: " + a);
	    }
	
}