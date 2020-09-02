package au.com.corejava.assignment1;

import java.util.Scanner;

public class CalculateSumAndAverage {

	public static void main(String[] args) {

		System.out.println("Enter numbers to calculate sum and average");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = scanner.nextInt();

		System.out.println("Enter first number:");
		int num2 = scanner.nextInt();

		int sum = num1 + num2;

		float average = (num1 + num2) / 2;

		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
		System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);

		scanner.close();
	}

}
