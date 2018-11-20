//Emmanuel Adeoye

import java.util.Scanner;

public class PositiveNumbers {
	public static void main(String[] args) {
		int num = 42;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("What is your favorite positive integer? ");
		int input = kb.nextInt();
		System.out.println("You entered " + input + " as your number");
		
		if(input == num) {
			System.out.println("I like the number 42 also!");
		}
		
		if(input % 2 == 0) {
			System.out.println("Your number is even.");
		}
		else {
			System.out.println("Your number is odd.");
		}
		
		if(input > 0) {
			System.out.println("Your number is positive.");
		}
		else if(input < 0) {
			System.out.println("Your number is negative.");
		}
		else {
			System.out.println("Your number is " + input + ".");
		}
	}
}