package au.com.corejava.assignment2;

import java.util.Scanner;

public class FindBiggerOfThreeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter numbers to find bigger of 3 numbers");

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Number " + num1 + " is bigger than number " + num2 + " and " + num3);
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("Number " + num1 + " is bigger than number " + num1 + " and " + num3);
		} else {
			System.out.println("Number " + num3 + " is bigger than number " + num1 + " and " + num1);
		}

		scanner.close();

	}

}
