package au.com.corejava.assignment1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		System.out.println("Enter numbers to find logic to swap");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = scanner.nextInt();

		System.out.println("Enter second number:");
		int num2 = scanner.nextInt();

		System.out.println("Numbers before swapping " + num1 + " and " + num2);

		num1 = num1 + num2;

		num2 = num1 - num2;

		num1 = num1 - num2;

		System.out.println("Numbers after swapping " + num1 + " and " + num2);

		scanner.close();
	}

}
