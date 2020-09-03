package au.com.corejava.assignment2;

import java.util.Scanner;

public class FindBiggerOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Enter numbers to find bigger of 2 numbers");

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println("Number " + num1 + " is bigger than number " + num2);
		} else {
			System.out.println("Number " + num2 + " is bigger than number " + num1);
		}

		scanner.close();

	}

}
