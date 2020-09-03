package au.com.corejava.assignment2;

import java.util.Scanner;

public class CalculateDiscount {

	public static void main(String[] args) {

		System.out.println("Enter bill amount and age to calculate the discount");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter bill amount");

		float billAmount = scanner.nextFloat();

		System.out.println("Enter age");

		int age = scanner.nextInt();

		float discountRate = 0.05f;

		float discountAmount = 0f;
		if (age > 50) {
			discountAmount = billAmount * discountRate;
		}
		System.out.println("Final bill is:" + (billAmount - discountAmount));

		scanner.close();
	}

}
