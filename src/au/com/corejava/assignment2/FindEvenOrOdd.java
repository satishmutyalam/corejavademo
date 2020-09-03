package au.com.corejava.assignment2;

import java.util.Scanner;

public class FindEvenOrOdd {

	public static void main(String[] args) {

		System.out.println("Enter number to find Even or Odd number");

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("Entered number " + num + " is Even");
		} else {
			System.out.println("Entered number " + num + " is Odd");
		}

		scanner.close();

	}

}
