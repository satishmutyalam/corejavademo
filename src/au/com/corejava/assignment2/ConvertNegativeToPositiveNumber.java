package au.com.corejava.assignment2;

import java.util.Scanner;

public class ConvertNegativeToPositiveNumber {

	public static void main(String[] args) {

		System.out.println("Enter number to convert negative to positive logic");

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println("Enteterd number is " + num);
		if (num < 0) {
			num = -num;
		}

		System.out.println("Number after conveting into positive is " + num);

		scanner.close();

	}

}
